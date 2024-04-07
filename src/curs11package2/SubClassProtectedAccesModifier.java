package curs11package2;

import curs11package1.ProtectedAccesModifier;

public class SubClassProtectedAccesModifier extends ProtectedAccesModifier{
 //sub class different package: yes
	public static void main(String[] args) {

		SubClassProtectedAccesModifier obj =  new SubClassProtectedAccesModifier();
		obj.printMesaj();
		
	}

}