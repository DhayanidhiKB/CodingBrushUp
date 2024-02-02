package Strings;

import java.util.LinkedHashMap;
import java.util.Set;

public class RemoveBothDuplicateCharacter {

    public static void main(String[] args) {

        String actualWord = "praveen";
        String removeduplicate = "";
        char[] eachChar = actualWord.toCharArray();

        LinkedHashMap<Character, Integer> remWordMap = new LinkedHashMap<>();
        for (char ch : eachChar) {
            remWordMap.put(ch, remWordMap.getOrDefault(ch, 0) + 1);
        }

        Set<Character> uniqueChar = remWordMap.keySet();
        for (char ch : uniqueChar) {
            if (remWordMap.get(ch) == 1) {
                removeduplicate += ch;
            }
        }
        System.out.println(removeduplicate);
    }
}
