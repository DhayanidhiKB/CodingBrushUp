package Strings;

import java.util.HashMap;
import java.util.Map;

public class WordsWithEvenCount {
    public static void main(String[] args) {
        String inputSentence = "Java I am testing this program";

        System.out.println("Input Sentence: " + inputSentence);

        printWordsWithEvenCount(inputSentence);
    }

    public static void printWordsWithEvenCount(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the characters in each word and store in a map
        for (String word : words) {
            wordCountMap.put(word, word.length());
        }

        System.out.print("Words with Even Count: ");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

