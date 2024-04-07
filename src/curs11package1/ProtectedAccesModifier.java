package curs11package1;

public class ProtectedAccesModifier {
 /*
  * Scopul este in acelasi pachet si sub clasa din pachete diferite
  * 
  * Clasele nu pot fi declarate ca protected
  * 
  * Aceasi clasa : yes
  * Alta clasa din acelasi pachet : yes
  * Subclasa (clasa copil) in acelasi pachet : yes
  * Subclasa in alt pacher : yes
  * Alta clasa in alt pachet : NO
  * 
  */
	protected String mesaj = "Protected Access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		
		ProtectedAccesModifier obj =  new ProtectedAccesModifier();
		obj.printMesaj();
		
	}
	
	
	
}