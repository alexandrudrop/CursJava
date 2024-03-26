package curs6.tema;

import java.util.Scanner;

public class CalculSumaNumere {

	public static void main(String[] args) {
		
		

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduceti un numar: ");
		        
		int numar = scan.nextInt();
		int sum = 0;

		while (numar > 0) {
		sum += numar % 10; 
		numar /= 10;       
		}

	System.out.println("Suma cifrelor este: " + sum);
    scan.close();
	}
}