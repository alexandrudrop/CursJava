package curs5.tema;

import java.util.Scanner;

public class PalindromCheck {

	
	public static void main(String[] args) {
		
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduceti un text: ");
        String text = scan.next().toLowerCase();
        scan.close();

        boolean estePalindrom = checkPalindrom(text);
        
		System.out.println(estePalindrom ? "Textul este palindrom." : "Textul nu este palindrom.");
    }

    public static boolean checkPalindrom(String text) {
        
    	String afisez = "";
        for (int i = 0; i < afisez.length() / 2; i++) {
            if (afisez.charAt(i) != afisez.charAt(afisez.length() - i - 1)) {
                return false;
            }
        }
        return true;
        
    }
 }