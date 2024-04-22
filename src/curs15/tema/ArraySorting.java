package curs15.tema;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        
        String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
        Integer[] intArray = {100, 500, 300, 400, 200};
        Character[] charArray = {'a', 'b', 'd', 'c'};

        
        sortArrays(textArray);
        sortArrays(intArray);
        sortArrays(charArray);

        
        System.out.println("Sorted String array: " + Arrays.toString(textArray));
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));
        System.out.println("Sorted Character array: " + Arrays.toString(charArray));
    }

    
    private static <T extends Comparable<T>> void sortArrays(T[] arr) {
        Arrays.sort(arr);
    }
}