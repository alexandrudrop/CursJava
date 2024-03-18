package curs5.tema;

import java.util.Scanner;

public class TablaInmultirii {
	
	public static void main(String args[]){ 
		Scanner scan = new Scanner(System.in); 
		System.out.println("Please enter a number");
		
		int number = scan.nextInt();
		
		for (int i = 1; i <= 10; i++){ 
			
			scan.close();
			System.out.println(number + " * " + i + " = " + (number * i));
		} 
		 
	} 

}
