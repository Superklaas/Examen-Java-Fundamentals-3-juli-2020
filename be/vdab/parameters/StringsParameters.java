package be.vdab.parameters;

public class StringsParameters {

    public static boolean isPalindrome(String string) {
        // make string without spaces and upper cases

        /*
        Duplicate code in printPalindrome. Maybe look at extracting some code to a method.
        Long methods like this should be split up in submethods!
         */
        String stringLowerCase = string.toLowerCase();
        String[] stringSplitAtSpaces = stringLowerCase.split(" ");
        StringBuilder stringWithoutSpaces = new StringBuilder();
        for (String stringSplitAtSpace : stringSplitAtSpaces) {
            stringWithoutSpaces.append(stringSplitAtSpace);
        }
        // make an array of the original string & create new array to put reverse of string
        char[] array = stringWithoutSpaces.toString().toCharArray();
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
        for (char c : array) {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u', 'y' -> countVowels++;
            }
        }
        return countVowels;
    }

    // optional, because palindromes look good!
    public static void printPalindrome(String string) {
        // make string without spaces and upper cases
        String stringLowerCase = string.toLowerCase();
        String[] stringSplitAtSpaces = stringLowerCase.split(" ");
        StringBuilder stringWithoutSpaces = new StringBuilder();
        for (String stringSplitAtSpace : stringSplitAtSpaces) {
            stringWithoutSpaces.append(stringSplitAtSpace);
        }
        // make an array of the original string & create new array to put reverse of string
        char[] array = stringWithoutSpaces.toString().toCharArray();
        char[] arrayReverse = new char[array.length];
        // fill up the reverse array
        for (int i = 0; i < array.length; i++) {
            arrayReverse[i] = array[array.length - i - 1];
        }
        // print out the palindromes
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(arrayReverse[i] + " ");
        }
    }
}
