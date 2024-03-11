package temacurs3;

import java.util.Scanner;

public class VerificareVarsta {
	
	int varsta;
	
	public void askAge () {
		System.out.println("Introduceti varsta:");
		Scanner scan = new Scanner(System.in);
		varsta = scan.nextInt();
		scan.close();
	}
	
	public void checkAge() {
		askAge();
		
		if (varsta < 18) {
			System.out.println("Esti minor!");
		}else if (varsta >= 18 && varsta <= 65) {
			System.out.println("Esti adult!");	
		}else {
			System.out.println("Esti batran!");			
		}
	}

}
