package AmazonInterview;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "Java 123";
        Map<Character, Integer> resultMap = charCount(input);
        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<Character, Integer> charCount(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        // edge case check
        if (input == null || input.isBlank()) {
            return charCountMap;
        }
        String filteredString = input.replaceAll("[^a-zA-Z]", " ").trim().toLowerCase();

        for (int i = 0; i < filteredString.length(); i++) {
            char ch = filteredString.charAt(i);
            if (!(Character.isDigit(ch))) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }
        return charCountMap;
    }
}
