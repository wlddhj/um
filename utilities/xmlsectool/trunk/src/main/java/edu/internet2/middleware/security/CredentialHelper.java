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

package edu.internet2.middleware.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.security.KeyException;
import java.security.KeyStore;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.Provider;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;

import javax.net.ssl.X509TrustManager;

import org.opensaml.xml.security.SecurityHelper;
import org.opensaml.xml.security.x509.BasicX509Credential;
import org.opensaml.xml.security.x509.X509Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Helper class for reading in cryptographic credentials. */
public class CredentialHelper {

    /** Class logger. */
    private static final Logger LOG = LoggerFactory.getLogger(CredentialHelper.class);

    public static X509TrustManager buildNoTrustTrustManager() {
        X509TrustManager noTrustManager = new X509TrustManager() {

            public void checkClientTrusted(X509Certificate ax509certificate[], String s) {
            }

            public void checkServerTrusted(X509Certificate ax509certificate[], String s) {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }

        };
        return noTrustManager;
    }

    /**
     * Reads in the X509 credentials from the filesystem.
     * 
     * @param keyFile path to the private key file
     * @param keyPassword password for the private key, may be null
     * @param certificateFile path to the certificate file associated with the private key
     * 
     * @return the credentials
     */
    protected static BasicX509Credential getFileBasedCredentials(String keyFile, String keyPassword,
            String certificateFile) throws KeyException, CertificateException {
        BasicX509Credential credential = new BasicX509Credential();
        LOG.debug("Reading PEM/DER encoded credentials from the filesystem");
        if (keyFile != null) {
            LOG.debug("Reading private key from file {}", keyFile);
            if (keyPassword == null) {
                credential.setPrivateKey(SecurityHelper.decodePrivateKey(new File(keyFile), null));
            } else {
                credential.setPrivateKey(SecurityHelper.decodePrivateKey(new File(keyFile), keyPassword.toCharArray()));
            }
            LOG.debug("Private key succesfully read");
        }
        LOG.debug("Reading certificates from file {}", certificateFile);
        credential.setEntityCertificateChain(X509Util.decodeCertificate(new File(certificateFile)));
        credential.setEntityCertificate(credential.getEntityCertificateChain().iterator().next());
        credential.setPublicKey(credential.getEntityCertificate().getPublicKey());
        LOG.debug("Certificates successfully");

        return credential;
    }

    /**
     * Reads in the X509 credentials from a keystore.
     * 
     * @param keystorePath path the keystore file
     * @param keystorePassword keystore password
     * @param keystoreProvider keystore providr identifier
     * @param keystoreType keystore type
     * @param keyAlias private key alias
     * @param keyPassword private key password, may not be null
     * 
     * @return the credentials
     */
    protected static BasicX509Credential getKeystoreCredential(String keystorePath, String keystorePassword,
            String keystoreProvider, String keystoreType, String keyAlias, String keyPassword) throws IOException,
            GeneralSecurityException {
        LOG.debug("Reading credentials from keystore");

        String storeType = keystoreType;
        if (storeType == null) {
            storeType = KeyStore.getDefaultType();
        }

        String storePassword = keystorePassword;
        if (storePassword == null) {
            storePassword = keyPassword;
        }

        KeyStore keystore;
        if (keystoreProvider != null) {
            keystore = KeyStore.getInstance(storeType, keystoreProvider);
        } else {
            keystore = KeyStore.getInstance(storeType);
        }
        keystore.load(new FileInputStream(keystorePath), storePassword.toCharArray());

        return getCredentialFromKeystore(keystore, keyAlias, keyPassword);
    }

    /**
     * Reads in the X509 credentials from a PKCS11 source.
     * 
     * @param keystoreProvider keystore provider class
     * @param pkcs11Config PKCS11 configuration file used by the keystore provider
     * @param keyAlias private key keystore alias
     * @param keyPassword private key password, may not be null
     * 
     * @return the credentials
     */
    @SuppressWarnings("unchecked")
    protected static BasicX509Credential getPKCS11Credential(String keystoreProvider, String pkcs11Config,
            String keyAlias, String keyPassword) throws IOException, GeneralSecurityException {
        LOG.debug("Install PKCS11 provider");

        KeyStore keystore = null;
        try {
            if (keystoreProvider != null) {
                LOG.debug("Creating PKCS11 keystore with provider {} and configuration file {}", keystoreProvider,
                        pkcs11Config);
                Class<Provider> providerClass = (Class<Provider>) XmlSecTool.class.getClassLoader().loadClass(
                        keystoreProvider);
                Constructor<Provider> providerConstructor = providerClass.getConstructor(String.class);
                Provider pkcs11Provider = providerConstructor.newInstance(pkcs11Config);
                pkcs11Provider.load(new FileInputStream(pkcs11Config));
                Security.addProvider(pkcs11Provider);
                keystore = KeyStore.getInstance("PKCS11", pkcs11Provider);
            } else {
                LOG.debug("Creating PKCS11 keystore with system wide provider and configuration file");
                keystore = KeyStore.getInstance("PKCS11");
            }
        } catch (ClassNotFoundException e) {
            LOG.error((new StringBuilder("Unable to load keystore provider class: ")).append(keystoreProvider)
                    .toString());
            System.exit(1);
        } catch (NoSuchMethodException e) {
            LOG.error("Keystore provider class does not provide a String-argument constructor");
            System.exit(1);
        } catch (Exception e) {
            LOG.error("Unable to read PKCS11 keystore", e);
            throw new IOException("Unable to read PKCS11 keystore", e);
        }

        LOG.debug("Initializing PKCS11 keystore");
        keystore.load(null, keyPassword.toCharArray());
        return getCredentialFromKeystore(keystore, keyAlias, keyPassword);
    }

    /**
     * Gets a credential from the given store.
     * 
     * @param keystore keystore from which to extract the credentials
     * @param keyAlias keystore key alias
     * @param keyPassword private key password
     * 
     * @return the extracted credential
     */
    @SuppressWarnings("unchecked")
    protected static BasicX509Credential getCredentialFromKeystore(KeyStore keystore, String keyAlias,
            String keyPassword) throws GeneralSecurityException {

        KeyStore.Entry keyEntry = keystore.getEntry(keyAlias,
                new KeyStore.PasswordProtection(keyPassword.toCharArray()));

        BasicX509Credential credential = new BasicX509Credential();
        if (keyEntry instanceof PrivateKeyEntry) {
            PrivateKeyEntry privKeyEntry = (PrivateKeyEntry) keyEntry;
            List certChain = Arrays.asList(privKeyEntry.getCertificateChain());
            credential.setEntityCertificate((X509Certificate) privKeyEntry.getCertificate());
            credential.setEntityCertificateChain(certChain);
            credential.setPrivateKey(privKeyEntry.getPrivateKey());
            credential.setPublicKey(privKeyEntry.getCertificate().getPublicKey());
        } else if (keyEntry instanceof KeyStore.TrustedCertificateEntry) {
            KeyStore.TrustedCertificateEntry certEntry = (KeyStore.TrustedCertificateEntry) keyEntry;
            credential.setEntityCertificate((X509Certificate) certEntry.getTrustedCertificate());
            credential.setPublicKey(credential.getEntityCertificate().getPublicKey());
        }

        LOG.debug("Successfully read credentials from keystore");
        return credential;
    }
}