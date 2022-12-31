package BasicsOfRestAssured;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest4 {

	
	@Test
	public void restAssuredGet() {
		 RestAssured
				
				.get("https://reqres.in/api/users?page=2")
				.then()
				.statusCode(200)
				.body("page", Matchers.equalTo("2"));
		
		
	
		
	}
}
