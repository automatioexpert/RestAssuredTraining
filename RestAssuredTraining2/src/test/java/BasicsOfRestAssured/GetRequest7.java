package BasicsOfRestAssured;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest7 {

	
	@Test
	public void restAssuredGet() {
	
		Response resp= RestAssured
				
				.get("https://restful-booker.herokuapp.com/booking");
		
	int id=	resp.jsonPath().getInt("[190].bookingid");
		
	System.out.println("ID is : "+id);
	System.out.println("=================");
	resp.prettyPrint();
		
				
	}
}
