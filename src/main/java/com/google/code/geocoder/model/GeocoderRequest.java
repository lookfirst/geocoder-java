package com.google.code.geocoder.model;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="mailto:panchmp@gmail.com">Michael Panchenko</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeocoderRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private String address;         //Address. Optional.
	private String language;        //Preferred language for results. Optional.
	private String region;          //Country code top-level domain within which to search. Optional.
	private LatLngBounds bounds;    //LatLngBounds within which to search. Optional.
	private LatLng location;        //LatLng about which to search. Optional.

	public GeocoderRequest(String address, String region) {
		this(address, null, region, null, null);
	}
}