package com.project.automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class putUser {
	
	@Test
	public void update1() {
		
		JSONObject request=new JSONObject();
		
		request.put("name", "morpheus" );
		request.put("job", "zion resident");
		
		given().body(request.toString());
		when().put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all().assertThat();
	}

}
