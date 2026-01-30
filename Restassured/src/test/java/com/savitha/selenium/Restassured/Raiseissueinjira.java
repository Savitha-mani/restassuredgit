package com.savitha.selenium.Restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import com.savitha.selenium.Restassured.resoucrces.data;

public class Raiseissueinjira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://Savithamani.atlassian.net";
		String response=given().header("Content-Type","application/json").header("Authorization","Basic U2F2aXRoYS5tYW5pQHlhaG9vLmNvbTpBVEFUVDN4RmZHRjBFelA2ZW1vNXZOa1RHbW9ENldwU1ZtNnlydVlrc3QyMGw4dlFFUFNNRkV6SEZ1VHlpbHpzY2hqbDEwWjdBWlR5WlFaM0xLWnFTZHEzd0pIQ1JSZ2dtRGw4cEFHMkdsWkZDWWszSlltQ3g4STFReDd2UWJBUm1DU2E2V2ZldWVaYklzYzhhRlV5NC1jd0FHbTdkYVJtOHRqN21hQmdoTXktWUxhQ2o2Q3JnYWM9NDQzQURBRkY=").
		body(data.createissue("SCRUM", "dropdown not working.")).when().post("/rest/api/2/issue").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath js=new JsonPath(response);
		String id=js.getString("id");
		System.out.println(id);
		
		given().pathParam("key", id)
		.header("Authorization","Basic U2F2aXRoYS5tYW5pQHlhaG9vLmNvbTpBVEFUVDN4RmZHRjBFelA2ZW1vNXZOa1RHbW9ENldwU1ZtNnlydVlrc3QyMGw4dlFFUFNNRkV6SEZ1VHlpbHpzY2hqbDEwWjdBWlR5WlFaM0xLWnFTZHEzd0pIQ1JSZ2dtRGw4cEFHMkdsWkZDWWszSlltQ3g4STFReDd2UWJBUm1DU2E2V2ZldWVaYklzYzhhRlV5NC1jd0FHbTdkYVJtOHRqN21hQmdoTXktWUxhQ2o2Q3JnYWM9NDQzQURBRkY=")
		.header("X-Atlassian-Token","no-check").multiPart("file",new java.io.File("C:\\Users\\savit\\OneDrive\\Pictures\\Screenshots\\1.png"))
		.when().post("/rest/api/2/issue/{key}/attachments")
		.then().log().all().assertThat().statusCode(200);
		

	}

}
