package curs4.tema;

/*
 * Scrie un program care intreba utilizatorul un punctaj
 * Daca utilizatorul introduce o valoare mai mare sau egala cu 90 ii atribuim FB
 * Daca utilizatorul introduce o valoare mai mare sau egala cu 80 ii atribuim B
 * Daca utilizatorul introduce o valoare mai mica decat 80 ii atribuim S
 * Daca a luat calificativ FB printam: "Ai primit: Foarte Bine"
 * Daca a luat calificativ B printam: "Ai primit: Bine"
 * Daca a luat calificativ s printam: "Ai primit: Suficient"
 */

import java.util.Scanner;

public class CalculCalificativ {
	

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti punctajul: ");
		int puncte = scan.nextInt();
		scan.close();
		
		var calificativ = (puncte >= 90) ? "Ai primit: Foarte Bine" : (puncte >= 80 ) ? "Ai primit: Bine" : "Ai primit: Suficient";
		System.out.println(calificativ);
		
		
	}

}
