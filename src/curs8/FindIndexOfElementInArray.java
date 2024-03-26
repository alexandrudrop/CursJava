package curs8;

public class FindIndexOfElementInArray {
	
	static String[] culori = {"rosu", "alb", "galben", "verde", "negru", "maro", "albastru", "mov"};

	public static void main(String[] args) {
		rezolvareCuFor("mov");
		rezolvareCuForEach("alb");
		rezolvareCuWhile("verde");
		rezolvareCuDoWHile("albastru");
		
		
	}
	
	public static void rezolvareCuFor(String culoare) {
		for(int i=0; i<culori.length; i++) {
			if(culori[i].equals(culoare)) {
				System.out.println(culoare + " se afla la pozitia " + i);
			}
			
		}
	}
	
	public static void rezolvareCuForEach (String culoare) {
		int i=0;
		for (String element : culori) {
			if (element.equals(culoare)) {
				
			}
			i++;
		}
	}
	
	public static void rezolvareCuWhile (String culoare) {
		int i = 0;
		while(i<culori.length) {
			if(culori[i].equals(culoare)) {
				System.out.println(culoare + " se afla la pozitia " + i);
		
			}
			i++;
		}
	}
	public static void rezolvareCuDoWHile(String culoare) {
		int i=0;
		do {
			if(culori[i].equals(culoare)) {
				System.out.println(culoare + " se afla la pozitia " + i);
			}
			i++;
		}while (i<culori.length);
	}

}