package curs11package1;

class DefaultAccesModifier {

/*
 * Default inseamna atunci cand nu specific nimic
 * Scopul este limitat la pachetul in care se afla
 * 
 * Aceasi clasa : yes
  * Alta clasa din acelasi pachet : yes
  * Subclasa (clasa copil) in acelasi pachet : yes
  * Subclasa in alt pachet : No
  * Alta clasa in alt pachet : NO
 * 
 */
	String mesaj = "Default acces modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
}