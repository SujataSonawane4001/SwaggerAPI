package com.activities;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetActivities {

	static String baseURL = "https://fakerestapi.azurewebsites.net/api/v1/Activities";

	@Test
	public void testGetActivities() {
		given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities").then().log().all()
				.statusCode(200);
		System.out.println("Chaitanya");

	}

	@Test
	public void verifyStatusCode() {
	 Response response=	given()
		.when()
		.get("https://fakerestapi.azurewebsites.net/api/v1/Activities");
	   
		assertEquals(200,response.statusCode(),"Expected status code is 200");

	}

	public void verifyResponseAndData() {
		Response response=given()
		.when()
		.get("https://fakerestapi.azurewebsites.net/api/v1/Activities");
		
	}

}
