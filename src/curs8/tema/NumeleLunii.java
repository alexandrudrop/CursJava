package curs8.tema;

import java.util.Scanner;

public class NumeleLunii {
    public static void main(String[] args) {
        
        String[] luni = {
            "Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie",
            "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};

        
        int numarLuna = valoareLuna();

        
        System.out.println("Luna care corespunde numarului " + numarLuna + " este " + luni[numarLuna - 1] + ".");
    }

    
    private static int valoareLuna() {
        Scanner scan = new Scanner(System.in);
        while (true) {
                System.out.print("Introduceti numarul lunii (1-12): ");
                int valoare = scan.nextInt();
                if (valoare >= 1 && valoare <= 12) {
                    return valoare;
                } else {
                    System.out.println("Valoare invalida. Va rog introduceti un numar intre 1 si 12.");
                }
                scan.nextLine();
                scan.close();
         }
     }
}
