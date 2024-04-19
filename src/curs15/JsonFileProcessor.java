package curs15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/*
 * 
 * [{  name = "ion",
 * 	  email = "ion@ion.com"
 *  },
 *  {  name = "ion",
 * 	  email = {
 * 				homeEmail = "ceva",
 * 				workemail = [{}, {}]
 *              }
 *  }
 *  ]
 * 
 */

public class JsonFileProcessor {

	@SuppressWarnings("unchecked")
	public void writeJsonFile() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "Oana");
		obj.put("email", "oana@oana.net");
		
		try(FileWriter file = new FileWriter("test.json")){
			
			file.write(obj.toJSONString());
			
		}catch(IOException e) {
			System.out.println("Nu am putut scrie fisierul");
		}
		
		
	}
	
	
	public void readJsonFile(String key) {
		
		try(FileReader file =  new FileReader("test.json")){
			JSONParser parser =  new JSONParser();
			JSONObject jsonObj =  (JSONObject) parser.parse(file);
			
			String value = (String) jsonObj.get(key);
			System.out.println(value);
			
		}catch(Exception e) {
			System.out.println("NU am putut citi fisierul");
		}
	}
	
	public void readJsonFile2(String key) {
		
		try(FileReader file =  new FileReader("data.json")){
			JSONParser parser =  new JSONParser();
			Object obiect = parser.parse(file);
			JSONArray obiectPrimar = (JSONArray) obiect;
			System.out.println(obiectPrimar);
			JSONObject jsonObject = (JSONObject) obiectPrimar.get(0);
			System.out.println(jsonObject);
			JSONObject timestamp = (JSONObject) jsonObject.get("timestamp");
			System.out.println(timestamp);
			String user =  (String) timestamp.get("user");
			System.out.println(user);
			
		}catch(Exception e) {
			System.out.println("NU am putut citi fisierul");
		}
	}
	
	
}