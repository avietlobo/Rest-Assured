package Requests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class AddPlaceAPI {

	@Test
	public void addPlace()
	{
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Danish house\",\r\n" + 
				"  \"phone_number\": \"(+91) 999 893 3937\",\r\n" + 
				"  \"address\": \"59, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"Danish-IN\"\r\n" + 
				"}\r\n" + 
				"").when().log().all().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		
		
		
		
		
		
		
	}
	
}

