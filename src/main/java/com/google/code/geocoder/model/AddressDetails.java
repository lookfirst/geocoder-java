package com.google.code.geocoder.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	private String country;
	private String administrativeAreaLevel1;
	private String locality;
	private String subLocality;
	private String route;
	private String streetAddress;
	private String subPremise;
}
