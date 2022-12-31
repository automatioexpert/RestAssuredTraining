package BasicsOfRestAssured;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest3 {

	@Test
	public void restAssuredGet() {

		Response response = RestAssured

				.get("https://reqres.in/api/users/2");

		Object id = response.jsonPath().get("data.id");
		System.out.println(id);

		String email = response.jsonPath().get("data.email");
		System.out.println(email);

		String url = response.jsonPath().get("support.url");
		System.out.println(url);

		String text = response.jsonPath().get("support.text");
		System.out.println(text);

		Object ID = response.jsonPath().get("data.id");

		System.out.println(ID instanceof String);
		System.out.println(ID instanceof Integer);
		System.out.println(ID instanceof Boolean);

		if (ID instanceof String) {
			System.out.println(ID.toString());
		} else if (ID instanceof Integer) {
			int i = (Integer) ID;

			System.out.println("I am Integer : " + i);
		}

		System.out.println("I am the Top Expert on the Planet..Thank God!!!!");

	}
}
