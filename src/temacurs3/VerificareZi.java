package temacurs3;

import java.util.Scanner;

public class VerificareZi {
	
	int zi;
	
	public void askWhatDayItIs() {
		System.out.println("Introduceti un numar intre 1 si 7:");
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
		scan.close();
	}
	
	public void checkWhatDayItIs() {
		askWhatDayItIs();
		if (zi == 0) {
			System.out.println("Te rog sa introduci un numar mai mare ca 0!");
		}else if (zi == 1) {
			System.out.println("Astazi este luni!");
		}else if (zi == 2) {
			System.out.println("Astazi este marti!");
		}else if (zi == 3) {
			System.out.println("Astazi este miercuri!");
		}else if (zi == 4) {
			System.out.println("Astazi este joi!");
		}else if (zi == 5) {
			System.out.println("Astazi este vineri!");
		}else if (zi == 6) {
			System.out.println("Astazi este sambata!");
		}else if (zi == 7) {
			System.out.println("Astazi este duminica!");
		}else {
			System.out.println("Saptamana are doar 7 zile. Te rog sa introduci un numar valid!");
		}
		
	}

}
