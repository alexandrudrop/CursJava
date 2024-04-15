package curs13;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		//nume=ion
		Map<String , String> map = new HashMap<>(); 
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("R", "Recruiter");
		
		System.out.println("---------------------------------");
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(map);
	
		map.put("D", "Director");
		
		System.out.println(map);
		map.put("d", "Director");
		System.out.println(map);

		System.out.println(map.get("x"));

		map.put("n", null);
		System.out.println(map);
		System.out.println(map.get("n"));
		
		System.out.println("---------------------------------------");
		
		System.out.println("Contains key : " + map.containsKey("T"));
		System.out.println("Contains value : " + map.containsValue("Recruiter"));
	
		System.out.println("---------------------------------------");

		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("---------------------------------------");

		for(String value : map.values()) {
			System.out.println(value);
		}
		 map.replace("d", "Developer");
		System.out.println(map);
		
		map.remove("n");
		System.out.println(map);
		
		System.out.println("---------------------------------------");

		Map<String , String> map2 = new HashMap<>(); 

		map2.put("a", "alb");
		map2.put("b", "bej");
		map2.put("c", "crem");

		map.putAll(map2);
		System.out.println(map);

		map.clear();
		map2.clear();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map2.size());
		System.out.println(map2.isEmpty());
		
	}

}