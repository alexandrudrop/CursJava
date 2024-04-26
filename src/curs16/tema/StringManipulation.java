package curs16.tema;

import java.util.Arrays;

public class StringManipulation {

    public static void main(String[] args) {
        String inputString = "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit. Aliquam consectetur odio ac quam commodo, eu " +
                "eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, " +
                "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius " +
                "malesuada. Nulla neque lacus, euismod quis erat nec, convallis " +
                "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. " +
                "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";

        int nullaCount = countOccurrences(inputString, "Nulla");
        System.out.println("Cuvantul \"Nulla\" apare de " + nullaCount + " ori.");

        String[] sentences = splitSentences(inputString);
        System.out.println("\nPropozitiile sunt: ");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }

        StringBuilder modifiedString = new StringBuilder(inputString);
        removeCharacter(modifiedString, 'a');
        System.out.println("\nString-ul dupa stergerea literei 'a' este: " + modifiedString);

        StringBuilder replaceString = new StringBuilder(inputString);
        replaceCharacter(replaceString, 'o', '#');
        System.out.println("\nString-ul dupa inlocuirea literei 'o' cu caracterul '#' este: " + replaceString);
    }

    private static int countOccurrences(String text, String textToCount) {
        int count = 0;
        int index = text.indexOf(textToCount);
        while (index != -1) {
            if (isWholeWord(text, index, textToCount.length())) {
                count++;
            }
            index = text.indexOf(textToCount, index + textToCount.length());
        }
        return count;
    }
    
    private static boolean isWholeWord(String text, int index, int textToCountLength) {
        if (index == 0 || !Character.isLetter(text.charAt(index - 1))) {
            int endIndex = index + textToCountLength;
            return endIndex == text.length() || !Character.isLetter(text.charAt(endIndex));
        }
        return false;
    }

    private static String[] splitSentences(String text) {
        StringBuilder sb = new StringBuilder(text);
        String[] sentences = sb.toString().split("\\.");
        return Arrays.stream(sentences)
                .map(String::trim)
                .toArray(String[]::new);
    }


    private static void removeCharacter(StringBuilder sb, char charToRemove) {
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == charToRemove) {
                sb.deleteCharAt(i);
            }
        }
    }

    private static void replaceCharacter(StringBuilder sb, char oldChar, char newChar) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == oldChar) {
                sb.setCharAt(i, newChar);
            }
        }
    }
}
