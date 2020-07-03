package be.vdab.parameters;

import java.util.Arrays;

public class StringsParameters {

    public static boolean isPalindrome(String string) {
        // make string without spaces and upper cases
        String stringLowerCase = string.toLowerCase();
        String[] stringSplitAtSpaces = stringLowerCase.split(" ");
        String stringWithoutSpaces = "";
        for (int i = 0; i < stringSplitAtSpaces.length; i++) {
            stringWithoutSpaces += stringSplitAtSpaces[i];
        }
        // make an array of the original string & create new array to put reverse of string
        char[] array = stringWithoutSpaces.toCharArray();
        char[] arrayReverse = new char[array.length];
        // fill up the reverse array
        for (int i = 0; i < array.length; i++) {
            arrayReverse[i] = array[array.length - i - 1];
        }
        // check if reverse is same as original
        boolean isPalindrome = true;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] != arrayReverse[i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static boolean isUrl(String string) {
        boolean isUrl = false;
        if (string.contains("http://")) {
            isUrl = true;
        }
        return isUrl;
    }

    public static int isVowel(String string) {
        char[] array = string.toCharArray();
        int countVowels = 0;
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 'a' :
                    countVowels++;
                    break;
                case 'e' :
                    countVowels++;
                    break;
                case 'i' :
                    countVowels++;
                    break;
                case 'o' :
                    countVowels++;
                    break;
                case 'u' :
                    countVowels++;
                    break;
                case 'y' :
                    countVowels++;
                    break;
            }
        }
        return countVowels;
    }

    // optional, because palindromes look good!
    public static void printPalindrome(String string) {
        // make string without spaces and upper cases
        String stringLowerCase = string.toLowerCase();
        String[] stringSplitAtSpaces = stringLowerCase.split(" ");
        String stringWithoutSpaces = "";
        for (int i = 0; i < stringSplitAtSpaces.length; i++) {
            stringWithoutSpaces += stringSplitAtSpaces[i];
        }
        // make an array of the original string & create new array to put reverse of string
        char[] array = stringWithoutSpaces.toCharArray();
        char[] arrayReverse = new char[array.length];
        // fill up the reverse array
        for (int i = 0; i < array.length; i++) {
            arrayReverse[i] = array[array.length - i - 1];
        }
        // print out the palindromes
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(arrayReverse[i] + " ");
        }
    }


}
