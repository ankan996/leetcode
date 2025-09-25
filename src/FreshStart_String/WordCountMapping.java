package FreshStart_String;

import java.util.Map;
import java.util.TreeMap;

public class WordCountMapping {
    public static void main(String[] args) {
        String inputStr = "This is a simple Java program to count words. This is simple.";

        Map<String, Integer> wordCountMap = getWordCountMapping(inputStr);

        // printing in correct format: [word : count of words]

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> getWordCountMapping(String input) {

        if (input == null || input.length() == 0) {
            return Map.of();
        }

        Map<String, Integer> wordCountMap = new TreeMap<>();

        String cleanedInput = input.replaceAll("[^a-zA-Z]]", "").trim().toLowerCase();

        String[] words = cleanedInput.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) +  1);
            }
        }

        return wordCountMap;








    }

    }

