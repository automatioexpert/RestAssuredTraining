package BasicsOfRestAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetRequest6 {

	
	@Test
	public void restAssuredGet() {
	
		Response resp=	RestAssured
				
				.get("https://reqres.in/api/users?page=2");
			
		System.out.println(resp.getHeader("Content-Type"));
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println(resp.getContentType());
		System.out.println(resp.getSessionId());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println("---------------------");
		System.out.println(resp.xmlPath());
		//	System.out.println(resp.getTime());
		System.out.println("---------------------");
		Headers header=	resp.getHeaders();
			
		for(Header h:header) {
			System.out.println(h.getName()+" value: "+h.getValue());
		}
			
		System.out.println("=====================================");
		RestAssured
				
				.get("https://reqres.in/api/users?page=2")
				.then()
				.time(Matchers.lessThanOrEqualTo(500L));
	
	
	}
}
