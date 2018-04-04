package com.test.modules;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.junit.Assert;

public class RestTeluguVideosAction {

	public static void testJson(String response) {

		JSONArray data = new JSONArray(response);

		int videos = data.length();

		Assert.assertTrue(videos > 50);

	}

	public static String callRESTService(String path)
			throws MalformedURLException, IOException, ProtocolException {
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());

		}

		String resp = IOUtils.toString(conn.getInputStream(), "utf-8");
		conn.disconnect();
		return resp;

	}
}
