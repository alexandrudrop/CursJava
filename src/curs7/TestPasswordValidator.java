package curs7;

public class TestPasswordValidator {

	public static void main(String[] args) {

		PasswordValidator obj =  new PasswordValidator();
		obj.printPasswordRules();
		obj.readUsername();
		

	/*	while(!obj.isValid) {
			
			obj.checkPasswordRules(obj.readProposedPassword());
		}*/
		
		do {
		//	System.out.println(obj.isValid);
			obj.checkPasswordRules(obj.readProposedPassword());
			
		}while(!obj.isValid);
		
		
		System.out.println("Parola valida!");
		
	}

}