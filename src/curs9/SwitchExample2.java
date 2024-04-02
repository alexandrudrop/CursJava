package curs9;
/*
 * facem un program care cere de la tastatura o luna si un an
 * 
 * printeaza cate zile are luna respectiva
 * 
 * 
 */

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu un an:");
		int an =  scan.nextInt();
		System.out.println("Introdu o luna:");
		int luna =  scan.nextInt();
		
		int days = 0;
	//	(an%4 == 0) && (an%100 != 0 || an%400 == 0)
		int zileAn = 365;
		
		switch(luna) {
		case 1,3,5,7,8,10,12 -> days = 31;
		case 4,6,9,11 -> days = 30;
		case 2 -> {
			if((an%4 == 0) && (an%100 != 0 || an%400 == 0)) {
				days = 29;
				zileAn = 366;
			}else {
				days = 28;

			}
		}
		default -> System.out.println("Luna invalida");
		
		}
		System.out.println("Anul aleas de tine are "+ zileAn+" zile!");

		System.out.println("Luna aleasa de tine are " + days + " zile!");

	}

}