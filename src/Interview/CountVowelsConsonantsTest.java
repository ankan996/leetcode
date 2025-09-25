package Interview;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsConsonantsTest {
    public static void main(String[] args) {
        String str = "Hello World 123!";

        // Create HashMaps to store vowels and consonants with their counts

        Map<Character, Integer> vowelsMap = new HashMap<>();
        Map<Character, Integer> consonantsMap = new HashMap<>();

        String filteredString = str.replaceAll("\\s+", "");

        for (int i = 0; i < filteredString.length(); i++) {
            char ch = filteredString.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowelsMap.put(ch, vowelsMap.getOrDefault(ch,0) + 1);
                } else {
                    consonantsMap.put(ch, consonantsMap.getOrDefault(ch,0) + 1);
                }
            }
        }

        System.out.println("Printing vowels and their count :");

        for (Character c : vowelsMap.keySet()) {
            System.out.println(c + " : " + vowelsMap.getOrDefault(c,0));
        }

        System.out.println("Printing consonants and their count :");

        for (Character c: consonantsMap.keySet()) {
            System.out.println(c + " : " + consonantsMap.getOrDefault(c,0));
        }

    }



}

