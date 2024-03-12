package curs4;



/*
 * simulam un cos de cumparaturi
 * avem 3 validari:
 * 1. verificam daca cosul este gol sau nu si printam
 * 2. verificam daca cosul contine peste 100 lei
 * 3. verificam daca numarul de produse este mai mare sau egal cu 5 (adica un cos mare --printam)
 * si daca valoarea cosului este peste 150 lei (adica valoare mare --printam)
 */
public class TernaryExample {

	public static void main(String[] args) {


		int numarProduse = 1;
		int totalPrestCos = 160;
		
		//1. verificam daca cosul este gol sau nu si printam
		
		String mesaj = numarProduse >0 ? "Avem produse" : "Cos gol!";
		System.out.println(mesaj);
		
		//2. verificam daca cosul contine peste 100 lei
		
		mesaj = totalPrestCos > 100 ? "Totalul depaseste 100 lei" : "Total sub 100 lei";
		System.out.println(mesaj);
		
		//3. verificam daca numarul de produse este mai mare sau egal cu 5 (adica un cos mare --printam)
		
		//mesaj = numarProduse >= 5 ? "Cos mare" : totalPrestCos > 150 ? "Valoare mare" :
		//mesaj = numarProduse >= 5 && totalPrestCos > 150 ? "Cos mare si valoare mare" :
		
		//--> nr de produs mare cu valoare mica
		//--> nr de produs mic cu valoare mare
		//--> nr de produs mare cu valoare mare
		//--> nr de produs mic cu valoare mica
		
		
		mesaj = numarProduse >= 5 && totalPrestCos > 150 ? "Cos mare si valoare mare" :
			numarProduse < 5 && totalPrestCos < 150 ? "Cos mic si valoare mica" : "cos intermediar";
		System.out.println(mesaj);
	

	}

}
