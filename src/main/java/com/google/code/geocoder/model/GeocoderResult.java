package com.google.code.geocoder.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="mailto:panchmp@gmail.com">Michael Panchenko</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeocoderResult implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<String> types;
	private String formattedAddress;
	private List<GeocoderAddressComponent> addressComponents;
	private GeocoderGeometry geometry;
	private boolean partialMatch;
}