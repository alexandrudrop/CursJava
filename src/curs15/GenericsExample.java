package curs15;

public class GenericsExample {

	public static void main(String[] args) {

		printCeva("text");
		//printCeva(123);
		
		printGeneric("text");
		printGeneric(123);
		printGeneric(123.4);
		printGeneric(true);
		
	}

	public static void printCeva(String text) {
		System.out.println(text);
	}
	
	public static <T> void printGeneric(T obiect) {
	
		System.out.println("Data type obiect : " + obiect.getClass().getName());
	}
	
	
}