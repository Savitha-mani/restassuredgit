package com.savitha.selenium.Restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import data.Jsonbody;

public class Crud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response= given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Jsonbody.addplace()).when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().response().asString();
		//System.out.println(response);
		
		JsonPath js=new JsonPath(response);
		String placeid=js.getString("place_id");
		System.out.println(placeid);
		
		//update place
		given().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n"
				+ "\"place_id\":\""+placeid+"\",\r\n"
				+ "\"address\":\"Savithaj23 winter walk, USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").when().put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));
		
		given().queryParam("key", "qaclick123").queryParam("place_id", placeid).header("Content-Type","application/json")
		.when().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).body("address", equalTo("Savithaj23 winter walk, USA"));
		
	}

}
