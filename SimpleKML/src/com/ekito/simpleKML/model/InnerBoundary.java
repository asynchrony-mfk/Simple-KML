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

import org.simpleframework.xml.ElementList;
import java.util.List;

/**
 * Contains a {@link LinearRing} element.
 */
public class InnerBoundary {

	/** The linear ring. */
	@ElementList(entry="LinearRing", inline=true, type=LinearRing.class, required=false)
	private List<LinearRing> linearRingList;



	/**
	 * Gets the linear ring.
	 *
	 * @return the linear ring
	 */
	public List<LinearRing> getLinearRingList() {
		return linearRingList;
	}

	/**
	 * Sets the linear ring.
	 *
	 * @param linearRingList the new linear ring
	 */
	public void setLinearRingList(List<LinearRing> linearRingList) {
		this.linearRingList = linearRingList;
	}
}
