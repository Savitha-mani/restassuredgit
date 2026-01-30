package com.savitha.selenium.Restassured.resoucrces;

public class data {
	
	public static String createissue(String keyvalue, String text) {
		return "{\r\n"
				+ "    \"fields\": {\r\n"
				+ "       \"project\":\r\n"
				+ "       {\r\n"
				+ "          \"key\": \""+keyvalue+"\"\r\n"
				+ "       },\r\n"
				+ "       \"summary\": \""+text+"\",\r\n"
				+ "       \"issuetype\": {\r\n"
				+ "          \"name\": \"Bug\"\r\n"
				+ "       }\r\n"
				+ "   }\r\n"
				+ "}";
	}
}
