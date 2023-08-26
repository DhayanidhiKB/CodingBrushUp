package Strings;

import java.util.HashMap;

public class CountOccurenceOfCharacterInString {

    public static void main(String [] args){
        String s="aabbcc";
        char[] EverySinglecharfromWord=s.toCharArray(); //Coverts the string to individual character

        HashMap<Character,Integer> charcountMap=new HashMap<>();

        //EverySingleCharacter from word is stored to character in forEachLoop
        for(char character:EverySinglecharfromWord){
            if(charcountMap.containsKey(character)){
                charcountMap.put(character,charcountMap.get(character)+1);
            }
            else{
                charcountMap.put(character,1);
            }
        }
        System.out.println(charcountMap);
    }
}
