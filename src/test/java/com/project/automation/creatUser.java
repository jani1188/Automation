package com.project.automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class creatUser {

	@Test
	public void creat() {
		
		JSONObject request=new JSONObject();
		
		request.put("name", "Jani");
		request.put("job", "leader");
		
		given().
		body(request.toString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201).log().all();
		
	}
}
