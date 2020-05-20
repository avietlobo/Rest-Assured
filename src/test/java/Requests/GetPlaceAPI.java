package Requests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetPlaceAPI {
	
	@Test
	public void getPlaceDetails() 
	{
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", "978945348acf0c5e267ad54a3fdffd19")
		.header("Accept", "application/json")
		.when().log().all().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200)
	    .extract().response().asString();
		
		JsonPath js= new JsonPath(response);
		System.out.println("ACCURACY IS =======" +js.getString("accuracy"));
	    System.out.println("LATTITUDE IS =======" + js.getString("location.latitude"));
		System.out.println("LONGITUDE IS =======" + js.getString("location.longitude"));
	}
	
}
