package JPMC_210612765;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class WordCountMapping {
    public static void main(String[] args) {
        String inputStr = "This is a simple Java program to count words. This is simple.";

        String[] words = inputStr.replaceAll("[^a-zA-Z]"," ").trim().split(" ");
        System.out.println(Arrays.toString(words));

        // instantiate a hashmap

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", " ").trim().toLowerCase();
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
