package curs3;

import java.util.Scanner;

/*
 * Facem un program care citeste trei numere de la tastatura
 * Verifica care dintre ele este cel mai mare si printeaza in consola
 * Daca doua numere sunt egale printeaza: numere egale
 */

public class CelMaiMareDintreTreiNumere {
	
	int nr1, nr2, nr3;
	
	/*
	 * int nr1;
	 * int nr2;
	 * int nr3;
	 */
	
	public void askTheUserForThreeNumbers () {
		System.out.println("Please enter first number:");
		Scanner scan = new Scanner(System.in);
		nr1 = scan.nextInt();
		System.out.println("Please enter second number:");
		nr2 = scan.nextInt();
		System.out.println("Please enter third number:");
		nr3 = scan.nextInt();
	}
	
	public void findOutBigestNumber() {
		
		askTheUserForThreeNumbers();
		
		if(nr1 > nr2 && nr1 > nr3) {
			System.out.println("First number is the greatest");
		}else if (nr2 > nr3 && nr2 > nr1) {
			System.out.println("Second number is the greatest");
		}else if (nr3 > nr1 && nr3 > nr2) {
			System.out.println("Third number is the greatest");
		}else{
			System.out.println("At least two numbers are equal");
			
		}
	}
	

}
