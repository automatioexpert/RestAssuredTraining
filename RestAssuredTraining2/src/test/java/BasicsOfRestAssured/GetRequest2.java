package BasicsOfRestAssured;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest2 {

	
	@Test
	public void restAssuredGet() {
	
		String  firstName=RestAssured
				
				.get("https://reqres.in/api/users?page=2")
				.then()
				.statusCode(200)
				.body("data.email[0]", Matchers.equalTo("michael.lawson@reqres.in"))
				.extract()
				.jsonPath()
				.getString("last_name");
		
	
System.out.println(firstName);
		
	}
}
