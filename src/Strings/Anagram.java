package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        anagram.findStringIsAnagram("listen", "silent");
    }

    public void findStringIsAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Given strings are not anagram");
        } else {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            if (Arrays.equals(str1CharArray, str2CharArray) == true) {
                System.out.println("Given strings are anagram");
            } else {
                System.out.println("Given strings are not anagram");
            }
        }
    }
}