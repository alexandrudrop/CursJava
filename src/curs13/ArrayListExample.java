package curs13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list =  new ArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Oana");
		list.add("Maria");
		list.add("Gabriel");
		list.add("Bogdan");
		list.add("Elena");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		System.out.println(list);
		
		System.out.println(list.get(4));
		System.out.println("-------------------------------------");
		
		list.add("Oana");
		
		list.add(3, "Carmen");
		
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		System.out.println(list.get(5));
		System.out.println("-------------------------------------");

		list.set(6, "Ioana");
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		System.out.println(list.size());
		
		list.add(7, "Vlad");
		
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		System.out.println("-------------------------------------");

		list.remove(0);
		
		System.out.println(list);
		
		list.remove("Bogdan");
		
		System.out.println(list);

		System.out.println(list.contains("Vasile"));
		System.out.println(list.contains("Vlad"));
		//System.out.println(list.get(6));
		list.add(6, "Marcel");
		//[Maria, Gabriel, Carmen, Elena, Ioana, Vlad, Marcel]

		//   0        1       2       3     4      5     6
		System.out.println(list.size());
		System.out.println(list.subList(1, 7));
		list.subList(1, 7).clear();
		System.out.println(list);
	}

}