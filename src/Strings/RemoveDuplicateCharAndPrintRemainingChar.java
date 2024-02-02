package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharAndPrintRemainingChar {

    public static void main(String[] args){

        String input="School";
        System.out.println("Output String after removing duplicate character :");
        Set<Character> linkedHashSet=new LinkedHashSet<Character>();

        for(int i=0;i<input.length();i++){
            linkedHashSet.add(input.charAt(i));
        }

        for (Character c:linkedHashSet){
            System.out.print(c);
        }
    }
}
