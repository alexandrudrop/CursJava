package curs12;

public class ExceptionExample {

	public static void main(String[] args) {
		
		
		String [] week = {"L", "Ma", "Mi", "J", "V", "S", "D"};
		//                 0     1     2    3    4    5    6
		
		
		
		try {
			
			System.out.println(week[7]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ai incercat sa accesezi un index in afara array-ului");
		}
		
		System.out.println("Some other code!");
		

	}

}
