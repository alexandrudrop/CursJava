package curs7;
/*
 * facem un joc de zaruri in care avem urmatoarele reguli
 * 1. daca userul da in total una dintre valori 2,6,11 --> Pierde jocul --> facem exit
 * 2. daca userul da in total 8, 12 --> Castiga jocul --> facem exit
 * 3. daca userul da in total 3,9 --> Repeta automat aruncarea
 * 4. Daca daca orice alta varianta decat cele de mai sus, il intrebam daca vrea sa mai dea inca o data
 * Raspunsul trebuie sa fie de forma yes- no si mapam in spate pe un true - false 
 * --daca raspune nu facem exist -- daca raspunde da, o luam de la capat
 * 
 */

import java.util.Scanner;

public class DiceGame {
	
	public static void main(String[] args) {

		boolean incercare = true;
		
		while(incercare) {
			
			int dice = (int) (Math.random() * 6+1);
			int dice2 = (int) (Math.random() * 6+1);
			int total = dice +dice2;
			
			
			if(total == 2 || total == 6 || total == 11) {
				System.out.println("Imi pare rau! Ai dat " + total + " Ai pierdut jocul!");
				break;
			}else if(total == 8 || total == 12) {
				System.out.println("Felicitari! Ai dat " + total + " Ai castigat jocul!");
				break;
			}else if(total == 3 || total == 9) {
				System.out.println("Ai dat " + total + " Automat mai dai o data!");
				continue;
			}else {
				
				boolean continuare = true;
				while(continuare) {
					System.out.println("Mai vrei sa continui jocul?");
					Scanner scan = new Scanner(System.in);
					String raspuns = scan.next().toLowerCase();
					//incercare = scan.next().equalsIgnoreCase("yes") ? incercare == true : incercare == false;
					
					if(raspuns.equals("yes")) {
						incercare = true ;
						continuare = false;
					}else if(raspuns.equals("no")) {
						incercare = false ;
						continuare = false;
					}else {
						System.out.println("Raspuns invalid. Raspunde cu Yes sau NO");
						continuare = true;

					}
					
				}
				
			}
			
		}
		
		System.out.println("Game over!");
		
	}

}