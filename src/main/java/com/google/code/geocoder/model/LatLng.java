package com.google.code.geocoder.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="mailto:panchmp@gmail.com">Michael Panchenko</a>
 * @link http://code.google.com/intl/uk/apis/maps/documentation/javascript/reference.html#LatLng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LatLng implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final int DEFAULT_PRECISION = 6;

	private BigDecimal lat, lng;

	/** helper constructor */
	public LatLng(String lat, String lng) {
		this(new BigDecimal(lat), new BigDecimal(lng));
	}

	/**
	 * @return Returns a string of the form "lat,lng" for this LatLng. We round the lat/lng values to 6 decimal places by default.
	 */
	public String toUrlValue() {
		return toUrlValue(DEFAULT_PRECISION);
	}

	/**
	 * @param precision We round the lat/lng values
	 * @return Returns a string of the form "lat,lng" for this LatLng.
	 */
	public String toUrlValue(int precision) {
		return lat.setScale(precision, BigDecimal.ROUND_HALF_EVEN).toString() + "," + lng.setScale(precision, BigDecimal.ROUND_HALF_EVEN).toString();
	}
}