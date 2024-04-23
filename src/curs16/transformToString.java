package curs16;

public class transformToString {

	public static void main(String[] args) {
		
		
		char ch = 'x';
		
		String chStr = Character.toString(ch);
		String chStr2 = String.valueOf(ch);
		
		System.out.println(chStr.getClass());
		System.out.println(chStr2.getClass());
		
		
		

	}

}
