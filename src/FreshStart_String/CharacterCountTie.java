package FreshStart_String;

import java.util.*;

public class CharacterCountTie {

    public static void main(String[] args) {
        //String input = "bbcaaddd";
        String input = "mAnkmanm";
        List<Character> resultList = getMostFrequentCharsInATie(input);
        System.out.println(resultList);

    }

    public static List<Character> getMostFrequentCharsInATie(String input) {
        // edge case check
        if (input == null || input.isBlank()) {
            return List.of();
        }

        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (int i = 0; i < cleanedInput.length(); i++) {
            char ch = cleanedInput.charAt(i);
            if (Character.isLetter(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // find the max count

        int maxCount = 0;

        for (Integer count : frequencyMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // logic to handle the tie situation

        List<Character> resultList = new LinkedList<>();

        // Iterating the frequencyMap object to get all the values where the count matches with the maxCount

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                resultList.add(entry.getKey());
            }
        }

        // sorting the resultList alphabetically
        Collections.sort((resultList));
        return resultList;

    }
}
