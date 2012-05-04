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


/**
 * A single tuple consisting of floating point values for longitude, latitude, and altitude (in that order). Longitude and latitude values are in degrees, where
 * longitude ≥ −180 and <= 180
 * latitude ≥ −90 and ≤ 90
 * altitude values (optional) are in meters above sea level
 */
public class Coordinate {

	/** The longitude. */
	private Float longitude;
	
	/** The latitude. */
	private Float latitude;
	
	/** The altitude. */
	private Float altitude;
	
	/**
	 * Instantiates a new coordinate.
	 *
	 * @param longitude the longitude
	 * @param latitude the latitude
	 * @param altitude the altitude
	 */
	public Coordinate(Float longitude, Float latitude, Float altitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
	}
	
	/**
	 * Instantiates a new coordinate.
	 *
	 * @param raw the raw
	 */
	public Coordinate(String raw) {
		String[] coords;
		coords = raw.split("(?<!\\\\),");
		this.longitude = Float.parseFloat(coords[0]);
		this.latitude = Float.parseFloat(coords[1]);
		this.altitude = coords.length>2? Float.parseFloat(coords[2]) : null;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public Float getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public Float getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the altitude.
	 *
	 * @return the altitude
	 */
	public Float getAltitude() {
		return altitude;
	}

	/**
	 * Sets the altitude.
	 *
	 * @param altitude the new altitude
	 */
	public void setAltitude(Float altitude) {
		this.altitude = altitude;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "";
		result += longitude + "," + latitude;
		result += altitude == null? "" : ","+altitude;
		result += " ";
		return result;
	}
}
