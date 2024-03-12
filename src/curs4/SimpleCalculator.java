package curs4;

import java.util.Scanner;

/*
 * Facem un calculator simplu pentru operatiile de baza +(adunare) -(scadere) * sau x(inmultire) / sau :(impartire)
 * intrebam userul un numar
 * intrebam userul operatia matematica
 * intrebam al doilea numar
 * Printam rezultatul
 */
public class SimpleCalculator {
	
	int num1, num2, result;
	char operatiaMate;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter the operation:");
		operatiaMate = scan.next().charAt(0);
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
	}
	
	public void calculateValue() {
		askTheUser();
		if(operatiaMate == '+') {
			result = num1 + num2;
			displayResult();
		}else if(operatiaMate == '-') {
			result = num1 - num2;
			displayResult();
		}else if(operatiaMate == '*' || operatiaMate == 'x') {
			result = num1 * num2;
			displayResult();
		}else if(operatiaMate == '/' || operatiaMate == ':') {
			result = num1 / num2;
			displayResult();
		}else {
			System.out.println("Operatie necunoscuta!");
		}
		
		
	}
	
	public void displayResult() {
		//if(operatiaMate == 'x' || operatiaMate == '*' || operatiaMate == '-' ||
		//		operatiaMate == '+' || operatiaMate == ':' || operatiaMate == '/') {
			
		//}
		System.out.println(num1 + "" +operatiaMate + "" + num2 + "=" + result);
	}

}
