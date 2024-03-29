package curs7.tema;


import java.util.Scanner;

public class ValidarePIN {
	    
	
	public static void main(String[] args) {
		
	        String defaultPin = "2244";

	        int maxAttempts = 3;
	        int attempts = 0;

	        Scanner scan = new Scanner(System.in);

	        do {
	            System.out.print("Enter your PIN: ");
	            String userPin = scan.nextLine();

	            if (userPin.equals(defaultPin)) {
	                System.out.println("Access granted");
	                break;
	            } else {
	                attempts++;
	                System.out.println("Wrong PIN");

	                if (attempts >= maxAttempts) {
	                    System.out.println("Maximum attempts reached. Card Blocked.");
	                    break;
	                }
	            }
	        } while (true);
	        scan.close();
	 }
}