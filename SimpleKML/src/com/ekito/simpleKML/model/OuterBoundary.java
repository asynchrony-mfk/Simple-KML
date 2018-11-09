/**
 * Copyright 2012 Ekito - http://www.ekito.fr/
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/**
 * Contains a {@link LinearRing} element.
 */
public class OuterBoundary {

    /** The linear ring. */
    @Element(name = "LinearRing", required = false)
    private LinearRing linearRing;


    /**
     * Gets the linear ring.
     *
     * @return the linear ring
     */
    public LinearRing getLinearRing() {
        return linearRing;
    }

    /**
     * Sets the linear ring.
     *
     * @param linearRing the new linear ring
     */
    public void setLinearRing(LinearRing linearRing) {
        this.linearRing = linearRing;
    }
}