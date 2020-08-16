package be.vdab.parameters;

public class TestParameters {
    public static void main(String[] args) {

        // 3 new Strings
        String s1 = "lepel";
        String s2 = "http://www.smartdeveloper.be";
        String s3 = "De mooie zeeman nam Anna mee zei oom Ed";
        String[] strings = {s1,s2,s3};

        // test isVowel method
        System.out.println("\nAMOUNT OF VOWELS PER STRING?");
        System.out.println(s1 + ": number of vowels " + StringsParameters.isVowel(s1));
        System.out.println(s2 + ": number of vowels " + StringsParameters.isVowel(s2));
        System.out.println(s3 + ": number of vowels " + StringsParameters.isVowel(s3));

        // test isUrl method
        System.out.println("\nIS THE STRING A URL?");
        for (int i = 0; i < strings.length; i++) {
            if (StringsParameters.isUrl(strings[i]) == true) {
                System.out.println(strings[i] + " is a URL");
            }
            else
                System.out.println(strings[i] + " is no URL");
        }

        // test isPalindrome method
        System.out.println("\nIS THE STRING A PALINDROME?");
        for (int i = 0; i < strings.length; i++) {
            if (StringsParameters.isPalindrome(strings[i]) == true) {
                System.out.println(strings[i] + " is a palindrome");
            }
            else
                System.out.println(strings[i] + " is not a palindrome");
        }

        // test printPalindromes method (optional, because palindromes look good!)
        System.out.println("\nHOW DO THE PALINDROMES LOOK LIKE?");
        StringsParameters.printPalindrome(s1);
        System.out.println();
        StringsParameters.printPalindrome(s2);
        System.out.println();
        StringsParameters.printPalindrome(s3);
    }

}
