package temacurs3;

import java.util.Scanner;

public class VerificarePunctajTest {
	
	int punct;
	
	public void askForPoints () {
		System.out.println("Introduceti punctajul:");
		Scanner scan = new Scanner(System.in);
		punct = scan.nextInt();
		scan.close();
	}
		
	public void checkPointNumber() {
		
		askForPoints();
		
		if (punct >= 0 && punct <= 65) {
			System.out.println("Ai picat. Mai incearca.");
		}else if (punct > 65){               //As fi putut sa fac doar cu else dar la test cu valoarea -1 mi-ar fi scris ca am trecut testul.
			System.out.println("Felicitari, ai trecut!");	
		}else {
			System.out.println("Ati introdus o valoare gresita!");
		}

	
	
	}
}