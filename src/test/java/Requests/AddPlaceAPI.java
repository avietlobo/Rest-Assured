package Requests;

import io.restassured.RestAssured;
import utils.JsonReader;
import utils.propertyFileReader;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentKlovReporter;

public class AddPlaceAPI {

	@Test
	public void addPlace() throws IOException
	{
		
		
		ExtentHtmlReporter html = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Configuration\\Extent.html");
		ExtentReports extent = new ExtentReports();
		 extent.attachReporter(html);
		 ExtentTest test = extent.createTest("Add Place API TC01");
		 RestAssured.baseURI=propertyFileReader.readPropertiesFile().getProperty("baseURI");
		 String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(JsonReader.readJsonfile("AddPlace.json")).when().log().all().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		
		test.pass("ADD PLACE API success");
		
		extent.flush();
	
	}
	
}

