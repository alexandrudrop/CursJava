package curs8;

import java.util.Random;

/*
 * facem un program care tine 6 numere intr-un array
 * numerele sunt intre 0 si 9
 * nu tinem numere duplicate in array
 * printez array-ul
 * 
 * genereaza numar
 * scrie in array
 * verifica duplicate
 * print array
 */

public class ArrayExample3 {
	
	public final int MAX_NUMBER = 9;
	public final int ARRAY_LENGTH = 6;
	
	public int generateNumber() {
		Random random = new Random();
		return random.nextInt(MAX_NUMBER);
	}
	
	public int [] generateArray() {
		int[] numbers = new int [ARRAY_LENGTH];
		
		numbers[0] = generateNumber();
		
		for(int i = 1; i<ARRAY_LENGTH; i++) {
			int randomNr = 0;
		
		
			do {
				randomNr = generateNumber();
			
			}while (checkDuplicate(randomNr, numbers));
			
			numbers[i] = randomNr;	
			
		}
		return numbers;
	}
	
	
	public boolean checkDuplicate(int randomNr, int[] array) {
		
		for(int number : array) {
			if(number == randomNr) {
				return true;
			}
			
		}
		return false;
	}
	
	
	
	public void printArray(int [] array) {
		
		for(int nr : array) {
			System.out.print(nr + " | ");
		}
		
	}

}
