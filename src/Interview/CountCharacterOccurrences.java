package Interview;

import java.util.LinkedHashMap;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        String input = "hello world";
        countCharacterOccurrences(input);
    }

    public static void countCharacterOccurrences(String str) {

        String filteredString = str.replaceAll("\\s+", "");
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (int i = 0; i < filteredString.length(); i++) {
            // extract one character from the filtered string and put it inside the map
            char ch = filteredString.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // printing the results

        for (Character res : charCountMap.keySet()) {
            System.out.println(res + " : " + charCountMap.get(res));
        }

    }
    }

