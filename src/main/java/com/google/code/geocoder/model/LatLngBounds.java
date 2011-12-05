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
public class LatLngBounds implements Serializable {
	private static final long serialVersionUID = 1L;

	private LatLng southwest, northeast;

	/**
	 * @return Returns a string of the form "lat_lo,lng_lo,lat_hi,lng_hi" for this bounds, where "lo" corresponds to the southwest corner of the bounding box, while "hi" corresponds to the northeast corner of that box.
	 */
	public String toUrlValue() {
		return toUrlValue(LatLng.DEFAULT_PRECISION);
	}

	/**
	 * @param precision
	 * @return Returns a string of the form "lat_lo,lng_lo,lat_hi,lng_hi" for this bounds, where "lo" corresponds to the southwest corner of the bounding box, while "hi" corresponds to the northeast corner of that box.
	 */
	public String toUrlValue(int precision) {
		return getSouthwest().toUrlValue(precision) + "," + getNortheast().toUrlValue(precision);
	}
}