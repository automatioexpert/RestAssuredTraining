package BasicsOfRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {

	@Test
	public void createBooking() {
RestAssured.given()
.log().all()
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.post("https://reqres.in/api/users")
		.then().log().all();
	
	//System.out.println(resp.getStatusCode());
	//resp.prettyPrint();
	}
}
