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

package net.shibboleth.utilities.java.support.logic;

import javax.annotation.Nullable;

import net.shibboleth.utilities.java.support.component.CountingDestructableInitializableValidatableComponent;

import com.google.common.base.Function;

/**
 * A function that counts the number of times {@link #destroy()}, {@link #initialize()} and {{@link #validate()} are
 * called.
 */
public class CountingDestructableInitializableValidatableFunction<T> extends CountingDestructableInitializableValidatableComponent implements Function<Object, T> {

    /** Value returned by the function. */
    private T returnValue;

    /**
     * Constructor.
     * 
     * @param value value returned by the function
     */
    public CountingDestructableInitializableValidatableFunction(@Nullable final T value) {
        returnValue = value;
    }

    /** {@inheritDoc} */
    public T apply(Object arg0) {
        return returnValue;
    }
}