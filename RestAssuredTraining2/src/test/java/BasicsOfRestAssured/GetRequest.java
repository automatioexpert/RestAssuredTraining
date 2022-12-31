package BasicsOfRestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

	//@Test
	public void demoee() {
		Demo d = new Demo();
		System.out.println(d.i);
	}

	@Test
	public void restAssuredGet() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.toString());
//		String body = response.asString();
//		System.out.println(body);

		int status = response.statusCode();
		System.out.println(status);

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		Assert.assertEquals(statusCode, 201);
		String line=response.getStatusLine();
		System.out.println(line);
	}
}
