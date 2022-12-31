package BasicsOfRestAssured;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PayloadAsMap2 {

	
	
	
	@Test
	public void createBooking() {
		
		//Skills
		Map<String,Object> skill1= new LinkedHashMap<String,Object>();
		skill1.put("sub", "Java");
		skill1.put("exp", "5");
		skill1.put("prof", "Expert");
		
		Map<String,Object> skill2= new LinkedHashMap<String,Object>();
		skill2.put("sub", "Java");
		skill2.put("exp", "5");
		skill2.put("prof", "Expert");
		
	//For Json Object
		List<Map<String, Object >> allSkills=new LinkedList<>();
		allSkills.add(skill1);
		allSkills.add(skill2);
		
	//Mobile
	List<String> mobile = new ArrayList<String>();
	mobile.add("023823623");
	mobile.add("2372327372");
	
	Map<String ,Object > bookingDates=new LinkedHashMap<>()	;
	bookingDates.put("date1","10-oct-2022");
	bookingDates.put("date2","10-oct-2023");
		
	//Final Payload
	
	Map<String,Object> finalPayload = new LinkedHashMap<String,Object>();
	finalPayload.put("allSkills", allSkills);
	finalPayload.put("mobile", mobile);
	finalPayload.put("dates", bookingDates);
	
		
RestAssured.given()
.log().all()
		.body(finalPayload)
		.post("https://reqres.in/api/users")
		.then().log().all();
	
	//System.out.println(resp.getStatusCode());
	//resp.prettyPrint();
System.out.println("I am the top expert on the Planet");

	}
}
