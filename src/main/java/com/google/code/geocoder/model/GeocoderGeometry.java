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
public class GeocoderGeometry implements Serializable {
	private static final long serialVersionUID = 1L;

	private LatLng location;
	private GeocoderLocationType locationType;
	private LatLngBounds viewport;
}