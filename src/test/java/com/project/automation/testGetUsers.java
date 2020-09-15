package com.project.automation;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class testGetUsers {
	
	@Test
	public void test1Get() {
		
		given().
		get("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
		
	}

}
