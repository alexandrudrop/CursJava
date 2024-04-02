package curs9.tema;

import java.util.Scanner;

public class ProgramBonusare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduceti anii de vechime in firma (1, 2, sau 3 ani): ");
        int seniority = scan.nextInt();

        System.out.print("Introduceti valoarea vanzarilor efectuate: ");
        double madeSells = scan.nextDouble();

        System.out.print("Introduceti luna (1-12) in care vanzarile au fost efectuate: ");
        int month = scan.nextInt();

        double bonus = 0;

        switch (seniority) {
            case 1:
                bonus = 100;
                break;
            case 2:
                bonus = 200;
                break;
            case 3:
                if (madeSells <= 5000) {
                    bonus = 600;
                } else if (madeSells > 5000 && madeSells <= 10000) {
                    if (month >= 1 && month <= 6) {
                        bonus = 800;
                    } else if (month >= 7 && month <= 11) {
                        bonus = 1000;
                    } else if (month == 12) {
                        bonus = 900;
                        System.out.println("In decembrie se vand singure!");
                    } 

                } else if (madeSells > 10000) {
                    bonus = 1200;
                } 
                break;
            default:
				System.out.println("Vechime invalida!");
        }

        System.out.println("Valoarea bonusului: " + bonus);
        scan.close();
    }
}