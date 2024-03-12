package curs4;

public class TestCalculatorTva {

	public static void main(String[] args) {
		CalculatorTVA produs1 = new CalculatorTVA(19);
		CalculatorTVA produs2 = new CalculatorTVA(5);
		CalculatorTVA produs3 = new CalculatorTVA(9);
		
		double rezultat1 = produs1.adunaTva(100);
		double rezultat2 = produs2.adunaTva(55);
		double rezultat3 = produs3.adunaTva(25);
		
		System.out.println("Rezultat produs1 = " + rezultat1);
		System.out.println("Rezultat produs2 = " + rezultat2);
		System.out.println("Rezultat produs3 = " + rezultat3);
		
		System.out.println("Numar total de calcule : " + CalculatorTVA.getCounterGlobal());
		

	}

}
