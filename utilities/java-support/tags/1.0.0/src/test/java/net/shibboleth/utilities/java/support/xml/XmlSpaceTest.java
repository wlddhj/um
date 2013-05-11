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

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Tests for {@link XmlSpace};
 */
public class XmlSpaceTest {

    @Test
    public void testToString() {
        Assert.assertEquals(XmlSpace.DEFAULT.toString(), "default", "Default string must be \"default\"");
        Assert.assertEquals(XmlSpace.PRESERVE.toString(), "preserve", "Preserve string must be \"preserve\"");
    }

    @Test
    public void testParseValue() {
        Assert.assertEquals(XmlSpace.parseValue("default"), XmlSpace.DEFAULT, "\"default\" should return a DEFAULT type");
        Assert.assertEquals(XmlSpace.parseValue("preserve"), XmlSpace.PRESERVE, "\"preserve\" should return a PRESERVE type");
        boolean thrown = false;
        try {
            Assert.assertEquals(XmlSpace.parseValue("wibble"), XmlSpace.PRESERVE, "\"preserve\" should return a PRESERVE type");            
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assert.assertTrue(thrown, "ParseValue of invalid value should throw and IllegalArgumentException");
    }

}
