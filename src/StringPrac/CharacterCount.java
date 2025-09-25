package StringPrac;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {

        String inputStr = "Java";
        Map<Character, Integer> charCountMap = charCounter(inputStr);

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<Character, Integer> charCounter(String inputStr) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        // edge case check
        if (inputStr == null || inputStr.isEmpty()) {
            return charCountMap;
        }
        String filteredString = inputStr.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < filteredString.length(); i++) {
            char ch = filteredString.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        return charCountMap;
    }
}
