package curs4;

import java.util.Scanner;

// var = (conditia) ? expresie daca true : expresie daca false

public class TernaryOperator {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int num1 = scan.nextInt();
		System.out.println("Please enter second number:");
		int num2 = scan.nextInt();
		
		if(num1>0) {
			System.out.println("Num1 este pozitiv");
		}else {
			System.err.println("Num1 este negativ");
		}
		
		// var = conditie ? true : false
		String result = (num1 > 0) ? "Num1 este pozitiv" : "Num1 este negativ";
		System.out.println(result);
		
		//verific daca num1 si num2 sunt pozitive
		result = (num1 > 0) && (num2 > 0) ? "Ambele sunt pozitive" : "Unul din nr este negativ";
		System.out.println(result);
		
		
		//verific care nr e mai mare si daca sunt egale
		if (num1 > num2) {
			System.out.println("Num1 este mai mare");
		}else if (num1 == num2) {
			System.out.println("Numerele sunt egale");
		}else {
			System.out.println("Num2 este cel mai mare");
		}
		
		result = num1 == num2 ? "Numerele sunt egale" : num1>num2 ? "Num1 este mai mare":"Num2 este mai mare";
		System.out.println(result);
	
	
	
	}
	
}
