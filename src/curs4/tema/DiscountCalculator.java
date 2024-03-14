package curs4.tema;

/*
 * Scrie un program care aplica un discount unei facturi
 * Daca factura este mai mare decat 100, aplica un discount de 10%
 * Daca factura este mai mica de 100, aplica un discount de 5%
 */


public class DiscountCalculator {

	public static void main(String[] args) {
		int pret = 89;
		
		double discountProcent = (pret > 100) ? pret * 10.0/100 : pret * 5.0/100;
		
		
		System.out.println("Total: " + pret + " RON");
		System.out.println("Reducerea aplicata este de " + discountProcent + "% !");

	}

}
