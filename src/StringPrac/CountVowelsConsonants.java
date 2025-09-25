package StringPrac;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsConsonants {
    public static void main(String[] args) {

        String inputString = "Hello Java 123";
        Map<Character, Integer> vowelsMap = new HashMap<>();
        Map<Character, Integer> consonantsMap = new HashMap<>();

        String filteredString = inputString.replaceAll("\\s+","").trim().toLowerCase();


        for (int i = 0; i < filteredString.length(); i++) {
            char ch = filteredString.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsMap.put(ch, vowelsMap.getOrDefault(ch, 0) + 1);
                } else {
                    consonantsMap.put(ch, consonantsMap.getOrDefault(ch,0) + 1);
                }
            }
        }

        System.out.println("Printing Vowels...");
        for (Map.Entry<Character, Integer> entry : vowelsMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Printing Consonants...");
        for (Map.Entry<Character, Integer> entry : consonantsMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
