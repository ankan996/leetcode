package JPMC_210612765;

import java.util.Map;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "Ankan 45667";

        Map<Character, Integer> result = getCharacterCount(inputString);

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }

    public static Map<Character, Integer> getCharacterCount(String inputString) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        // edge case check
        if (inputString == null || inputString.isEmpty()) {
            return characterIntegerMap;
        }

        String filteredString = inputString.replaceAll("[^a-zA-Z]"," ").trim().toLowerCase();

        for (int i = 0; i < filteredString.length(); i++) {
            // will pick one character and check if it is not a digit and put it inside the map.
            char ch = filteredString.charAt(i);
            if (!Character.isDigit(ch)) {
                characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1);
            }
        }
        return characterIntegerMap;
    }
}
