package StringPrac;

import java.util.HashMap;
import java.util.Map;

public class WordCountMapping {

    public static void main(String[] args) {
        String inputStr = "This is a simple Java program to count words. This is simple.";
        Map<String, Integer> wordCountMap = wordCountMapping(inputStr);

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> wordCountMapping(String inputStr) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        // edge case check
        if (inputStr == null || inputStr.isEmpty()) {
            return wordCountMap;
        }
        // Split the sentence by spaces
        String[] words = inputStr.trim().toLowerCase().split("\\s+");

        for (String word : words) {
            // remove punctuation marks if any from each word
            word = word.replaceAll("[^a-zA-Z]","");

            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word,0) + 1);
            }
        }
        return wordCountMap;
    }
}