package curs15;

public class VarargsExample {

	public static void main(String...args) {

		printCeva(33,"A", "B");
		printCeva(12,"A", "B", "C");
		printCeva(12);
		
	}

	
	/*public static void printCeva(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}*/
	//JavascriptExecutor executeScript (String jscode, WebElement...list)
	
	
	public static void printCeva(int number, String...values) {
		
		for(String element : values) {
			System.out.println(element);
		}
	}
	
	public static <T> void printCevaGenerics(T...values) {
		
		for(T element : values) {
			System.out.println(element);
		}
	}
	
}