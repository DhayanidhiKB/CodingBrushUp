package Strings;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args){


        String rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String value=sc.next();
        //String originalString=value;

        for(int i=value.length()-1;i>=0;i--){
            rev=rev+value.charAt(i);
        }

        if(value.equals(rev)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }
    }
}
