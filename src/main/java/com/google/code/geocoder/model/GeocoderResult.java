package com.google.code.geocoder.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author <a href="mailto:panchmp@gmail.com">Michael Panchenko</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class GeocoderResult implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<String> types;
	private String formattedAddress;
	private List<GeocoderAddressComponent> addressComponents;
	private GeocoderGeometry geometry;
	private boolean partialMatch;

	/**
	 * Safely converts the types into enums.
	 */
	public List<GeocoderResultType> getGeocoderResultTypes() {
		if (types != null) {
			List<GeocoderResultType> rts = new ArrayList<GeocoderResultType>();
			for (String type : types) {
				try {
					rts.add(GeocoderResultType.fromValue(type));
				} catch (IllegalArgumentException e) {
					log.debug("Missing enum: " + type);
				}
			}
			return rts;
		} else {
			return Collections.emptyList();
		}
	}

}