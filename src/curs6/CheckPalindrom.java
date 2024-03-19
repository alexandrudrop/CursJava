package curs6;

import java.util.Scanner;

public class CheckPalindrom {

	public static void main(String[] args) {
		
		
		//radar
		//cuvant = "radar" --> cuvant.lenght()-1 --> cuvant.lenght() == 5
		//cuvantIntors = ""
		//cuvantIntors = radar.charAt(4) --> r
		//cuvantIntors = cuvantIntors + radar.charAt(3) --> a
		// ra = ra + radar.charAt(2)
		//.............
		//cuvantIntors = radar
		//cuvant == cuvantIntors
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un cuvant:");
		String cuvantInitial = scan.next();
		
		String cuvantIntors = "";
		
		for (int i = cuvantInitial.length()-1; i>=0; i--) {
			
			cuvantIntors = cuvantIntors + cuvantInitial.charAt(i);
		}
		
		System.out.println("Cuvant initial : " + cuvantInitial);
		System.out.println("Cuvant intors : " + cuvantIntors);
		
		String palindrom = cuvantInitial.equals(cuvantIntors) ? "Este palindrom":"Nu este palindrom";
		System.out.println(palindrom);
		
		System.out.println("--------------------------------------");
		StringBuilder sb = new StringBuilder(cuvantInitial);
		System.out.println("String builder " + sb.reverse());
		
	}

}
