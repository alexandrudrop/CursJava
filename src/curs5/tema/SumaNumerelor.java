package curs5.tema;

import java.util.Scanner;

public class SumaNumerelor {

	public static void main(String args[]){ 
		Scanner scan = new Scanner(System.in);
		double sum = 0.0; 
		
		for (int i = 1; i <= 10; i++){ 
			System.out.println("Please enter number " + i + ": ");
			double number = scan.nextDouble();
			sum += number;
			
		} 
		scan.close();
		System.out.println("The sum of the numbers is: " + sum ); 
	} 

}
