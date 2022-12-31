package JsonSchemaValidation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.restassured.RestAssured;

public class TypeRefExamples {


	@JsonIgnore
	private int id;
		
	@Test
	public void createBooking() {
		Map<String,String> data = new LinkedHashMap<String,String>();
		data.put("State", "NW");
		data.put("Area", "Bay");
		data.put("Area2", "Ba1y");
		
		
		Map<String, Object> jsonObjVV= new LinkedHashMap<String,Object>();
		jsonObjVV.put("name", "Pashdhsdh");
		jsonObjVV.put("Address", "news");
		jsonObjVV.put("data", data);
		
		Map<String,String> data1 = new LinkedHashMap<String,String>();
		data1.put("State", "NW");
		data1.put("Area", "Baili");
		//data.put("Area2",jsonObj1);
		
		
		Map<String, Object> jsonObj2= new LinkedHashMap<String,Object>();
		jsonObj2.put("name", "smith");
		jsonObj2.put("Address", "nws");
		jsonObj2.put("data", data1);
		
		List<Map<String,Object>> allEmps =  new ArrayList<>();
		allEmps.add(jsonObjVV);
		allEmps.add(jsonObj2);
		
		
		
		
		
RestAssured.given()
.log().all()
		.body(allEmps)
		.post("https://reqres.in/api/users")
		.then().log().all();
	
	//System.out.println(resp.getStatusCode());
	//resp.prettyPrint();
	}
}
