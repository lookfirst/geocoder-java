package com.google.code.geocoder.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
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

	/**
	 * Safely converts the types into enums.
	 */
	public List<GeocoderResultType> getGeocoderResultTypes() {
		if (types != null) {
			List<GeocoderResultType> rts = new ArrayList<GeocoderResultType>();
			for (String type : types) {
				GeocoderResultType t = GeocoderResultType.fromValue(type);
				if (t != null)
					rts.add(t);
			}
			return rts;
		} else {
			return Collections.emptyList();
		}
	}

}