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
public class GeocoderAddressComponent implements Serializable {
	private static final long serialVersionUID = 1L;

	private String longName;
	private String shortName;
	private List<String> types;
}