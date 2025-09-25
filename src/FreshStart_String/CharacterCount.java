package FreshStart_String;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "Java 123";
        Map<Character, Integer> resultMap = charCount(input);

        // iterating the resultMap object to print the character and count

        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    public static Map<Character, Integer> charCount(String input) {

        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();

        // edge case check

        if (input == null || input.isBlank()) {
            return characterIntegerMap;
        }

        String filteredString = input.replaceAll("\\s","").trim().toLowerCase();

        for (int i = 0;  i < filteredString.length(); i++) {
            char ch = filteredString.charAt(i);
            // check if the character is not a digit
            if ((Character.isLetter(ch))) {
                characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1);
            }
        }
        return characterIntegerMap;


    }

}
