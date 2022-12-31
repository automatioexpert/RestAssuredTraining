package BasicsOfRestAssured;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequest5 {

	@Test
	public void restAssuredGet() {

		JsonPath jsonPath = RestAssured

				.get("https://reqres.in/api/users?page=2").then().statusCode(200)
				// .body("data.email[0]", Matchers.equalTo("michael.lawson@reqres.in"))
				.extract().jsonPath();

		System.out.println(jsonPath.getString("page"));

		System.out.println(jsonPath.getString("total_pages"));
		System.out.println(jsonPath.getString("data[0].first_name"));
		System.out.println(jsonPath.getString("data[0].avatar"));

		System.out.println("=============================");

		System.out.println(jsonPath.getString("total_pages"));
		System.out.println(jsonPath.getString("data[1].first_name"));
		System.out.println(jsonPath.getString("data[2].avatar"));

	}
}
