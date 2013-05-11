/*
 * Licensed to the University Corporation for Advanced Internet Development, 
 * Inc. (UCAID) under one or more contributor license agreements.  See the 
 * NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The UCAID licenses this file to You under the Apache 
 * License, Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.shibboleth.utilities.java.support.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.validation.Schema;

import net.shibboleth.utilities.java.support.annotation.constraint.NonnullElements;
import net.shibboleth.utilities.java.support.annotation.constraint.NullableElements;
import net.shibboleth.utilities.java.support.annotation.constraint.Unmodifiable;
import net.shibboleth.utilities.java.support.component.AbstractDestructableInitializableComponent;
import net.shibboleth.utilities.java.support.component.ComponentInitializationException;
import net.shibboleth.utilities.java.support.component.ComponentSupport;
import net.shibboleth.utilities.java.support.logic.Constraint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

//TODO(lajoie) see if we can use either java.util.concurrent or Guava classes for the pool so we don't have to manage synchronicity

/**
 * A pool of JAXP 1.3 {@link DocumentBuilder}s.
 * 
 * This is a pool implementation of the caching factory variety, and as such imposes no upper bound on the number of
 * DocumentBuilders allowed to be concurrently checked out and in use. It does however impose a limit on the size of the
 * internal cache of idle builder instances via the value configured via {@link #setMaxPoolSize(int)}.
 * 
 * Builders retrieved from this pool may (but are not required to) be returned to the pool with the method
 * {@link #returnBuilder(DocumentBuilder)}.
 * 
 * References to builders are kept by way of {@link SoftReference} so that the garbage collector may reap the builders
 * if the system is running out of memory.
 * 
 * This implementation of {@link ParserPool} does not allow its properties to be modified once it has been initialized.
 */
@ThreadSafe
public class BasicParserPool extends AbstractDestructableInitializableComponent implements ParserPool {

    /** Class logger. */
    private final Logger log = LoggerFactory.getLogger(BasicParserPool.class);

    /** Factory used to create new builders. */
    private DocumentBuilderFactory builderFactory;

    /** Cache of document builders. */
    private Stack<SoftReference<DocumentBuilder>> builderPool;

    /** Max number of builders allowed in the pool. Default value: 5 */
    private int maxPoolSize;

    /** Builder attributes. */
    private Map<String, Object> builderAttributes;

    /** Whether the builders are coalescing. Default value: true */
    private boolean coalescing;

    /** Whether the builders expand entity references. Default value: true */
    private boolean expandEntityReferences;

    /** Builder features. */
    private Map<String, Boolean> builderFeatures;

    /** Whether the builders ignore comments. Default value: true */
    private boolean ignoreComments;

    /** Whether the builders ignore element content whitespace. Default value: true */
    private boolean ignoreElementContentWhitespace;

    /** Whether the builders are namespace aware. Default value: true */
    private boolean namespaceAware;

    /** Schema used to validate parsed content. */
    private Schema schema;

    /** Whether the builder should validate. Default value: false */
    private boolean dtdValidating;

    /** Whether the builders are XInclude aware. Default value: false */
    private boolean xincludeAware;

    /** Entity resolver used by builders. */
    private EntityResolver entityResolver;

    /** Error handler used by builders. */
    private ErrorHandler errorHandler;

    /** Constructor. */
    public BasicParserPool() {
        super();
        maxPoolSize = 5;
        builderPool = new Stack<SoftReference<DocumentBuilder>>();
        builderAttributes = Collections.emptyMap();
        coalescing = true;
        expandEntityReferences = true;
        builderFeatures = Collections.emptyMap();
        ignoreComments = true;
        ignoreElementContentWhitespace = true;
        namespaceAware = true;
        schema = null;
        dtdValidating = false;
        xincludeAware = false;
        errorHandler = new LoggingErrorHandler(log);
    }

    /** {@inheritDoc} */
    @Nonnull public DocumentBuilder getBuilder() throws XMLParserException {
        checkInitializedNotDestroyed();

        DocumentBuilder builder = null;

        synchronized (builderPool) {
            while (builder == null && !builderPool.isEmpty()) {
                builder = builderPool.pop().get();
            }
        }

        // Will be null if either the stack was empty, or the SoftReference
        // has been garbage-collected
        if (builder == null) {
            builder = createBuilder();
        }

        if (builder != null) {
            return new DocumentBuilderProxy(builder, this);
        }

        return null;
    }

    /** {@inheritDoc} */
    public void returnBuilder(@Nullable final DocumentBuilder builder) {
        checkInitializedNotDestroyed();

        if (builder == null || !(builder instanceof DocumentBuilderProxy)) {
            return;
        }

        final DocumentBuilderProxy proxiedBuilder = (DocumentBuilderProxy) builder;
        if (proxiedBuilder.getOwningPool() != this) {
            return;
        }

        synchronized (proxiedBuilder) {
            if (proxiedBuilder.isReturned()) {
                return;
            }
            // Not strictly true in that it may not actually be pushed back
            // into the cache, depending on builderPool.size() below. But
            // that's ok. returnBuilder() shouldn't normally be called twice
            // on the same builder instance anyway, and it also doesn't matter
            // whether a builder is ever logically returned to the pool.
            proxiedBuilder.setReturned(true);
        }

        final DocumentBuilder unwrappedBuilder = proxiedBuilder.getProxiedBuilder();
        unwrappedBuilder.reset();
        final SoftReference<DocumentBuilder> builderReference = new SoftReference<DocumentBuilder>(unwrappedBuilder);

        synchronized (builderPool) {
            if (builderPool.size() < maxPoolSize) {
                builderPool.push(builderReference);
            }
        }
    }

    /** {@inheritDoc} */
    @Nonnull public Document newDocument() throws XMLParserException {
        checkInitializedNotDestroyed();

        DocumentBuilder builder = null;
        final Document document;

        try {
            builder = getBuilder();
            document = builder.newDocument();
        } finally {
            returnBuilder(builder);
        }

        return document;
    }

    /** {@inheritDoc} */
    @Nonnull public Document parse(@Nonnull final InputStream input) throws XMLParserException {
        checkInitializedNotDestroyed();

        Constraint.isNotNull(input, "Input stream can not be null");

        final DocumentBuilder builder = getBuilder();
        try {
            final Document document = builder.parse(input);
            return document;
        } catch (SAXException e) {
            throw new XMLParserException("Unable to parse inputstream, it contained invalid XML", e);
        } catch (IOException e) {
            throw new XMLParserException("Unable to read data from input stream", e);
        } finally {
            returnBuilder(builder);
        }
    }

    /** {@inheritDoc} */
    @Nonnull public Document parse(@Nonnull final Reader input) throws XMLParserException {
        checkInitializedNotDestroyed();

        Constraint.isNotNull(input, "Input reader can not be null");

        final DocumentBuilder builder = getBuilder();
        try {
            final Document document = builder.parse(new InputSource(input));
            return document;
        } catch (SAXException e) {
            throw new XMLParserException("Invalid XML", e);
        } catch (IOException e) {
            throw new XMLParserException("Unable to read XML from input stream", e);
        } finally {
            returnBuilder(builder);
        }
    }

    /**
     * Gets the max number of builders the pool will hold.
     * 
     * @return max number of builders the pool will hold
     */
    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    /**
     * Sets the max number of builders the pool will hold.
     * 
     * @param newSize max number of builders the pool will hold
     */
    public synchronized void setMaxPoolSize(final int newSize) {
        checkNotInitializedNotDestroyed();

        maxPoolSize = (int) Constraint.isGreaterThan(0, newSize, "New maximum pool size must be greater than 0");
    }

    /**
     * Gets the builder attributes used when creating builders. This collection is unmodifiable.
     * 
     * @return builder attributes used when creating builders
     */
    @Nonnull @NonnullElements public Map<String, Object> getBuilderAttributes() {
        return Collections.unmodifiableMap(builderAttributes);
    }

    /**
     * Sets the builder attributes used when creating builders.
     * 
     * @param newAttributes builder attributes used when creating builders
     */
    public synchronized void setBuilderAttributes(@Nullable @NullableElements final Map<String, Object> newAttributes) {
        checkNotInitializedNotDestroyed();

        if (newAttributes == null) {
            builderAttributes = Collections.emptyMap();
        } else {
            builderAttributes = new HashMap<String, Object>(Maps.filterKeys(newAttributes, Predicates.notNull()));
        }
    }

    /**
     * Gets whether the builders are coalescing.
     * 
     * @return whether the builders are coalescing
     */
    public boolean isCoalescing() {
        return coalescing;
    }

    /**
     * Sets whether the builders are coalescing.
     * 
     * @param isCoalescing whether the builders are coalescing
     */
    public synchronized void setCoalescing(final boolean isCoalescing) {
        checkNotInitializedNotDestroyed();

        coalescing = isCoalescing;
    }

    /**
     * Gets whether builders expand entity references.
     * 
     * @return whether builders expand entity references
     */
    public boolean isExpandEntityReferences() {
        return expandEntityReferences;
    }

    /**
     * Sets whether builders expand entity references.
     * 
     * @param expand whether builders expand entity references
     */
    public synchronized void setExpandEntityReferences(final boolean expand) {
        checkNotInitializedNotDestroyed();

        expandEntityReferences = expand;
    }

    /**
     * Gets the builders' features. This collection is unmodifiable.
     * 
     * @return the builders' features
     */
    @Nonnull @NonnullElements @Unmodifiable public Map<String, Boolean> getBuilderFeatures() {
        return builderFeatures;
    }

    /**
     * Sets the the builders' features.
     * 
     * @param newFeatures the builders' features
     */
    public synchronized void setBuilderFeatures(@Nullable @NullableElements final Map<String, Boolean> newFeatures) {
        checkNotInitializedNotDestroyed();

        if (newFeatures == null) {
            builderFeatures = Collections.emptyMap();
        } else {
            builderFeatures = ImmutableMap.copyOf(Maps.filterKeys(newFeatures, Predicates.notNull()));
        }
    }

    /**
     * Gets whether the builders ignore comments.
     * 
     * @return whether the builders ignore comments
     */
    public boolean isIgnoreComments() {
        return ignoreComments;
    }

    /**
     * Sets whether the builders ignore comments.
     * 
     * @param ignore The ignoreComments to set.
     */
    public synchronized void setIgnoreComments(final boolean ignore) {
        checkNotInitializedNotDestroyed();

        ignoreComments = ignore;
    }

    /**
     * Get whether the builders ignore element content whitespace.
     * 
     * @return whether the builders ignore element content whitespace
     */
    public boolean isIgnoreElementContentWhitespace() {
        return ignoreElementContentWhitespace;
    }

    /**
     * Sets whether the builders ignore element content whitespace.
     * 
     * @param ignore whether the builders ignore element content whitespace
     */
    public synchronized void setIgnoreElementContentWhitespace(final boolean ignore) {
        checkNotInitializedNotDestroyed();

        ignoreElementContentWhitespace = ignore;
    }

    /**
     * Gets whether the builders are namespace aware.
     * 
     * @return whether the builders are namespace aware
     */
    public boolean isNamespaceAware() {
        return namespaceAware;
    }

    /**
     * Sets whether the builders are namespace aware.
     * 
     * @param isNamespaceAware whether the builders are namespace aware
     */
    public synchronized void setNamespaceAware(final boolean isNamespaceAware) {
        checkNotInitializedNotDestroyed();

        namespaceAware = isNamespaceAware;
    }

    /**
     * Gets the schema used to validate the XML document during the parsing process.
     * 
     * @return schema used to validate the XML document during the parsing process
     */
    @Nullable public Schema getSchema() {
        return schema;
    }

    /**
     * Sets the schema used to validate the XML document during the parsing process.
     * 
     * @param newSchema schema used to validate the XML document during the parsing process
     */
    public synchronized void setSchema(@Nullable final Schema newSchema) {
        checkNotInitializedNotDestroyed();

        schema = newSchema;
        if (schema != null) {
            setNamespaceAware(true);
            builderAttributes.remove("http://java.sun.com/xml/jaxp/properties/schemaSource");
            builderAttributes.remove("http://java.sun.com/xml/jaxp/properties/schemaLanguage");
        }
    }

    /**
     * Gets whether the builders are validating.
     * 
     * @return whether the builders are validating
     */
    public boolean isDTDValidating() {
        return dtdValidating;
    }

    /**
     * Sets whether the builders are validating.
     * 
     * @param isValidating whether the builders are validating
     */
    public synchronized void setDTDValidating(final boolean isValidating) {
        checkNotInitializedNotDestroyed();

        dtdValidating = isValidating;
    }

    /**
     * Gets whether the builders are XInclude aware.
     * 
     * @return whether the builders are XInclude aware
     */
    public boolean isXincludeAware() {
        return xincludeAware;
    }

    /**
     * Sets whether the builders are XInclude aware.
     * 
     * @param isXIncludeAware whether the builders are XInclude aware
     */
    public synchronized void setXincludeAware(final boolean isXIncludeAware) {
        checkNotInitializedNotDestroyed();

        xincludeAware = isXIncludeAware;
    }

    /**
     * Gets the size of the current pool storage.
     * 
     * @return current pool storage size
     */
    protected int getPoolSize() {
        return builderPool.size();
    }

    /**
     * Creates a new document builder.
     * 
     * @return newly created document builder
     * 
     * @throws XMLParserException thrown if their is a configuration error with the builder factory
     */
    @Nonnull protected DocumentBuilder createBuilder() throws XMLParserException {
        checkInitializedNotDestroyed();

        try {
            final DocumentBuilder builder = builderFactory.newDocumentBuilder();

            if (entityResolver != null) {
                builder.setEntityResolver(entityResolver);
            }

            if (errorHandler != null) {
                builder.setErrorHandler(errorHandler);
            }

            return builder;
        } catch (ParserConfigurationException e) {
            log.debug("Unable to create new document builder", e);
            throw new XMLParserException("Unable to create new document builder", e);
        }
    }

    /**
     * Initialize the pool.
     * 
     * @throws ComponentInitializationException thrown if pool can not be initialized, or if it is already initialized
     *             {@inheritDoc}
     */
    protected void doInitialize() throws ComponentInitializationException {
        super.doInitialize();

        try {
            final DocumentBuilderFactory newFactory = DocumentBuilderFactory.newInstance();

            for (Map.Entry<String, Object> attribute : builderAttributes.entrySet()) {
                newFactory.setAttribute(attribute.getKey(), attribute.getValue());
            }

            for (Map.Entry<String, Boolean> feature : builderFeatures.entrySet()) {
                if (feature.getKey() != null) {
                    newFactory.setFeature(feature.getKey(), feature.getValue().booleanValue());
                }
            }

            newFactory.setCoalescing(coalescing);
            newFactory.setExpandEntityReferences(expandEntityReferences);
            newFactory.setIgnoringComments(ignoreComments);
            newFactory.setIgnoringElementContentWhitespace(ignoreElementContentWhitespace);
            newFactory.setNamespaceAware(namespaceAware);
            newFactory.setSchema(schema);
            newFactory.setValidating(dtdValidating);
            newFactory.setXIncludeAware(xincludeAware);

            builderFactory = newFactory;

        } catch (ParserConfigurationException e) {
            throw new ComponentInitializationException("Unable to configure builder factory", e);
        }
    }

    /** {@inheritDoc} */
    protected void doDestroy() {
        builderPool.clear();
        super.doDestroy();
    }

    /** Helper method to test class state. */
    private void checkInitializedNotDestroyed() {
        ComponentSupport.ifNotInitializedThrowUninitializedComponentException(this);
        ComponentSupport.ifDestroyedThrowDestroyedComponentException(this);
    }

    /** Helper method to test class state. */
    private void checkNotInitializedNotDestroyed() {
        ComponentSupport.ifInitializedThrowUnmodifiabledComponentException(this);
        ComponentSupport.ifDestroyedThrowDestroyedComponentException(this);
    }

    /** A proxy that prevents the manages document builders retrieved from the parser pool. */
    protected class DocumentBuilderProxy extends DocumentBuilder {

        /** Builder being proxied. */
        private final DocumentBuilder builder;

        /** Pool that owns this parser. */
        private final ParserPool owningPool;

        /** Track accounting state of whether this builder has been returned to the owning pool. */
        private boolean returned;

        /**
         * Constructor.
         * 
         * @param target document builder to proxy
         * @param owner the owning pool
         */
        public DocumentBuilderProxy(final DocumentBuilder target, final BasicParserPool owner) {
            owningPool = owner;
            builder = target;
            returned = false;
        }

        /** {@inheritDoc} */
        public DOMImplementation getDOMImplementation() {
            checkValidState();
            return builder.getDOMImplementation();
        }

        /** {@inheritDoc} */
        public Schema getSchema() {
            checkValidState();
            return builder.getSchema();
        }

        /** {@inheritDoc} */
        public boolean isNamespaceAware() {
            checkValidState();
            return builder.isNamespaceAware();
        }

        /** {@inheritDoc} */
        public boolean isValidating() {
            checkValidState();
            return builder.isValidating();
        }

        /** {@inheritDoc} */
        public boolean isXIncludeAware() {
            checkValidState();
            return builder.isXIncludeAware();
        }

        /** {@inheritDoc} */
        public Document newDocument() {
            checkValidState();
            return builder.newDocument();
        }

        /** {@inheritDoc} */
        public Document parse(final File f) throws SAXException, IOException {
            checkValidState();
            return builder.parse(f);
        }

        /** {@inheritDoc} */
        public Document parse(final InputSource is) throws SAXException, IOException {
            checkValidState();
            return builder.parse(is);
        }

        /** {@inheritDoc} */
        public Document parse(final InputStream is) throws SAXException, IOException {
            checkValidState();
            return builder.parse(is);
        }

        /** {@inheritDoc} */
        public Document parse(final InputStream is, final String systemId) throws SAXException, IOException {
            checkValidState();
            return builder.parse(is, systemId);
        }

        /** {@inheritDoc} */
        public Document parse(final String uri) throws SAXException, IOException {
            checkValidState();
            return builder.parse(uri);
        }

        /** {@inheritDoc} */
        public void reset() {
            // ignore, entity resolver and error handler can't be changed
        }

        /** {@inheritDoc} */
        public void setEntityResolver(final EntityResolver er) {
            checkValidState();
            return;
        }

        /** {@inheritDoc} */
        public void setErrorHandler(final ErrorHandler eh) {
            checkValidState();
            return;
        }

        /**
         * Gets the pool that owns this parser.
         * 
         * @return pool that owns this parser
         */
        protected ParserPool getOwningPool() {
            return owningPool;
        }

        /**
         * Gets the proxied document builder.
         * 
         * @return proxied document builder
         */
        protected DocumentBuilder getProxiedBuilder() {
            return builder;
        }

        /**
         * Check accounting state as to whether this parser has been returned to the owning pool.
         * 
         * @return true if parser has been returned to the owning pool, otherwise false
         */
        protected boolean isReturned() {
            return returned;
        }

        /**
         * Set accounting state as to whether this parser has been returned to the owning pool.
         * 
         * @param isReturned set true to indicate that parser has been returned to the owning pool
         */
        protected void setReturned(final boolean isReturned) {
            returned = isReturned;
        }

        /**
         * Check whether the parser is in a valid and usable state, and if not, throw a runtime exception.
         */
        protected void checkValidState() {
            if (isReturned()) {
                throw new IllegalStateException("DocumentBuilderProxy has already been returned to its owning pool");
            }
        }

        /** {@inheritDoc} */
        protected void finalize() throws Throwable {
            super.finalize();
            owningPool.returnBuilder(this);
        }
    }
}