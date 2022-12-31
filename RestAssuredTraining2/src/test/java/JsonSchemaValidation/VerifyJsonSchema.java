package JsonSchemaValidation;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class VerifyJsonSchema {


	
	@Test
	public void createBooking() {
		Map<String,String> data = new LinkedHashMap<String,String>();
		data.put("State", "NW");
		data.put("Area", "Bay");
		data.put("Area2", "Ba1y");
		
		
		Map<String, Object> jsonObj1= new LinkedHashMap<String,Object>();
		jsonObj1.put("name", "Pashdhsdh");
		jsonObj1.put("Address", "news");
		jsonObj1.put("data", data);
		
		Map<String,String> data1 = new LinkedHashMap<String,String>();
		data1.put("State", "NW");
		data1.put("Area", "Baili");
		//data.put("Area2",jsonObj1);
		
		
		Map<String, Object> jsonObj2= new LinkedHashMap<String,Object>();
		jsonObj2.put("name", "smith");
		jsonObj2.put("Address", "nws");
		jsonObj2.put("data", data1);
		
		List<Map<String,Object>> allEmps =  new ArrayList<>();
		allEmps.add(jsonObj1);
		allEmps.add(jsonObj2);
		
		String path="F:\\API\\RestAssuredTraining\\src\\test\\java\\JsonSchemaValidation\\BookingSchema.json";
		File file = new File(path);
		
		
RestAssured.given()
.log().all()
		.body(allEmps)
		.post("https://reqres.in/api/users")
		.then().log().all()
		.body(JsonSchemaValidator.matchesJsonSchema(file));
	

	}
	
}
