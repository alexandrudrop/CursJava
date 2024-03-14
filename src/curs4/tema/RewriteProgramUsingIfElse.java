package curs4.tema;

public class RewriteProgramUsingIfElse {

	public static void main(String[] args) {
		
		//ternary
		int comision;
		int vanzari = 3500;
		comision = (vanzari>2500) ? vanzari * 5/100 : 0;
		
		System.out.println("Comisionul tau este :" + comision);
		
		
		//rewritten with if-else
		if (vanzari > 2500)
			comision = vanzari *5/100;
		else
			comision = 0;
		System.out.println("Comisionul tau este :" + comision);

	}

}
