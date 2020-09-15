package com.project.automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class deleteUser {
	
	@Test
	public void delete() {
		
		JSONObject request2=new JSONObject();
		
		given().
		body(request2.toString()).
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).log().all();
		
		
		
		
	}

}
