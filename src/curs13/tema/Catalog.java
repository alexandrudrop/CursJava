package curs13.tema;

import java.util.*;

public class Catalog {
   
	public static void main(String[] args) throws WrongGradeException {
        
        Map<String, Integer> catalog = new HashMap<>();

        
        catalog.put("ALINA", 9);
        catalog.put("BOGDAN", 8);
        catalog.put("COSTIN", 7);
        catalog.put("DUMITRU", 9);
        catalog.put("EVA", 8);
        catalog.put("FLORIN", 9);

        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = scan.next().toUpperCase();
        System.out.print("Enter student grade: ");
        int studentGrade = scan.nextInt();
        scan.close();
        
        try {
        if (studentGrade < 1 || studentGrade > 10) {
        	System.out.println("Introduceti o nota valida!");
        	throw new WrongGradeException ();
        }
        
        if (catalog.containsKey(studentName)) {
            int existingGrade = catalog.get(studentName);
            if (studentGrade < existingGrade) {
                System.out.println("Nu ai nevoie de alta nota");
            } else {
            	catalog.put(studentName, studentGrade);
                System.out.println("Nota actualizata!");
            }
        } else {
        	catalog.put(studentName, studentGrade);
            System.out.println("Nu aveai nota, ti-am trecut acum!");
        }
        

        System.out.println("Catalog:");
        for (Map.Entry<String, Integer> entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        }catch(Exception e) {
			e.printStackTrace();
        }
    }
}