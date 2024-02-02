package Strings;

import java.util.*;

public class DuplicateCharacterInAString {

    public static void main(String[] args) {
        String actualWord = "praveen";
        String removeduplicate="";
        char[] eachChar=actualWord.toCharArray();

        Set<Character> letterSet=new HashSet<>();

        for(int i=0;i< eachChar.length;i++){
            if(!letterSet.add(eachChar[i])){
                removeduplicate+=eachChar[i];
            }
        }
        //System.out.println("Given word after removing duplicate :"+removeduplicate);//letterSet.add(eachChar[i])
        System.out.println("duplicate character in string is :"+removeduplicate);//!letterSet.add(eachChar[i])

        //letterSet.add(eachChar[i])---removes one of duplicate character and prints the string with other duplicate character
        //!letterSet.add(eachChar[i])--Prints duplicate character alone

    }
}


