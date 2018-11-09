/**
 * Copyright 2012 Ekito - http://www.ekito.fr/
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ekito.simpleKML.model;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;

/**
 * https://developers.google.com/kml/documentation/kmlreference#gxtrack
 * http://googlegeodevelopers.blogspot.com/2010/07/making-tracks-new-kml-extensions-in.html 
 * 
 * &lt;ExtendedData&gt;
        &lt;SchemaData schemaUrl="#schema"&gt;
          &lt;gx:SimpleArrayData name="cadence"&gt;
            &lt;gx:value&gt;86&lt;/gx:value&gt;
            &lt;gx:value&gt;103&lt;/gx:value&gt;
            &lt;gx:value&gt;108&lt;/gx:value&gt;
            &lt;gx:value&gt;113&lt;/gx:value&gt;
            &lt;gx:value&gt;113&lt;/gx:value&gt;
            &lt;gx:value&gt;113&lt;/gx:value&gt;
            &lt;gx:value&gt;113&lt;/gx:value&gt;
          &lt;/gx:SimpleArrayData&gt;
          ...
 **/
@Namespace(prefix="gx")
public class SimpleArrayData{

    /** The name. */
    @Attribute(required=true)
    private String name;

    /** The simple array. */
    @ElementList(entry="value", inline=true, type=String.class, required=true)
    @Namespace(prefix="gx")
    private List<String> value;    

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the when.
     *
     * @return the value
     */
    public List<String> getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value the new value
     */
    public void setValue(List<String> value) {
        this.value = value;
    }
}
