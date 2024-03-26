package curs5.tema;

import java.util.Scanner;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		
		
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Cate temperaturi vreti sa transformati? ");
        int numTemperaturi = scan.nextInt();

        
        for (int i = 1; i <= numTemperaturi; i++) {
            System.out.print("\nIntroduceti temperatura " + i + " in Celsius (°C): ");
            double celsius = scan.nextDouble();

            
            double fahrenheit = (celsius * 9 / 5) + 32;

           
            System.out.printf("Temperatura Celsius de " + celsius + " grade este in Farenheit " + fahrenheit + " grade.");
        }

        scan.close();

	}

}
