package curs14.tema;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class CaloriiLeguma {
    public static void main(String[] args) {
        
        Properties vegetableCalories = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("calorii_leguma.properties");
            vegetableCalories.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            System.err.println("Eroare la incarcarea datelor legate de numarul de calorii al legumei.");
            return;
        }

        Scanner scan = new Scanner(System.in);
        String vegetableName;

        do {
            System.out.print("Ce leguma doriti sa cumparati? ");
            vegetableName = scan.nextLine().toLowerCase();

            if (!vegetableName.matches("[a-zA-Z]+")) {
                System.err.println("Input-ul nu este o leguma. Te rog sa alegi o leguma.");
            } else if (vegetableCalories.containsKey(vegetableName)) {
                int calories = Integer.parseInt(vegetableCalories.getProperty(vegetableName));
                System.out.println("Leguma aleasa de tine are " + calories + " de calorii.");
            } else {
                System.out.println("Nu vindem aceasta leguma. Te rog sa alegi alta leguma.");
            }
        } while (!vegetableCalories.containsKey(vegetableName));

        scan.close();
    }
}