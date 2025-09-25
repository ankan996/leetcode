package AmazonInterview;

import java.util.HashMap;
import java.util.Map;

public class WordCountMappingDemo {
    public static void main(String[] args) {
        String inputStr = "This is a simple Java program to count words. This is simple.";
        String[] words = inputStr.trim().toLowerCase().split(" ");

        Map<String, Integer> resultMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", " ").trim().toLowerCase();
            resultMap.put(word, resultMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(resultMap);

    }
}
