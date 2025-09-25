package FreshStart_String;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "Java 123 Jaaj";

        char mostFrequentCharacter = getMostFrequentChar(input);

        if (mostFrequentCharacter != '\0') {
            System.out.println(mostFrequentCharacter);
        } else {
            System.out.println("No valid characters are found ...");
        }

    }

    public static char getMostFrequentChar(String input) {
        // edge case check
        if (input == null || input.isBlank()) {
            return '\0';
        }

        String cleanedString = input.replaceAll("\\s", "").toLowerCase();

        // creating a Map object to store all the characters along with their respective counts

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (int i = 0; i < cleanedString.length(); i++) {
            char ch = cleanedString.charAt(i);
            if (Character.isLetter(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // logic starts for finding out the most frequent character

        char maxChar = '\0';
        int maxCount = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return maxChar;
    }
}
