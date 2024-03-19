package curs6;

import java.util.Scanner;

/*
 * facem un program care calculeaza salariul pe o saptamana
 * intrebam userul cate ore a lucrat
 * si calculam doar daca a lucrat maxim 40 si minim 1
 * daca introduce un numar invalid de ore il rugam sa introduca din nou
 * pana introduce un numar valid
 * rate per hour = 25
 */

public class WhileExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cate ore ai lucrat?");
		
		int oreLucrate = scan.nextInt();
		
		while(oreLucrate < 1 || oreLucrate > 40) {
			System.out.println("Numar de ore invalid");
			System.out.println("Introdu un numar valid de ore (intre 1 si 40) :");
			oreLucrate = scan.nextInt();
		}
		System.out.println("Salariul tau pentru orele lucrate este :" + oreLucrate * 25);
		

	}

}
