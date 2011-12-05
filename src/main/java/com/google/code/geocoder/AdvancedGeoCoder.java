package com.google.code.geocoder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;

import com.google.code.geocoder.model.GeocodeResponse;

/**
 * @author <a href="mailto:panchmp@gmail.com">Michael Panchenko</a>
 */
public class AdvancedGeoCoder extends Geocoder {
	private static HttpClient httpClient = new HttpClient(new MultiThreadedHttpConnectionManager());

	public synchronized HttpClient getHttpClient() {
		return httpClient;
	}

	protected GeocodeResponse request(String urlString) throws IOException {
		final GetMethod getMethod = new GetMethod(urlString);
		try {
			httpClient.executeMethod(getMethod);
			final Reader reader = new InputStreamReader(getMethod.getResponseBodyAsStream(), getMethod.getResponseCharSet());

			return MAPPER.readValue(reader, GeocodeResponse.class);
		} finally {
			getMethod.releaseConnection();
		}
	}
}