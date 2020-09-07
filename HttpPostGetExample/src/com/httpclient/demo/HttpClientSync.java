package com.httpclient.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSync {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/activities/"))
				.GET().build();
		request=HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/activities/")).POST(BodyPublishers.ofString("{\r\n" + 
				"  \"ID\": 0,\r\n" + 
				"  \"Title\": \"string\",\r\n" + 
				"  \"DueDate\": \"2020-08-20T06:56:12.538Z\",\r\n" + 
				"  \"Completed\": true\r\n" + 
				"}")).header("Content-Type","application/json").build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("Status==>" + response.statusCode());
		System.out.println(response.body());
	}
}
