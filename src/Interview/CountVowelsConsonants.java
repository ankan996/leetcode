package Interview;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        String str = "Hello World 123!";

        // Create HashMaps to store vowels and consonants with their counts

        Map<Character, Integer> vowelsMap = new HashMap<>();
        Map<Character, Integer> consonantsMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // check if the character is a letter
            if (Character.isLetter(ch)) {
                // convert the character to lower case for easy operation
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsMap.put(ch, vowelsMap.getOrDefault(ch,0) + 1 );
                } else  {
                    consonantsMap.put(ch, consonantsMap.getOrDefault(ch, 0) + 1);
                }
            }
        }

        System.out.println("Printing vowels and their count :");
        for (char vowel : vowelsMap.keySet()) {
            System.out.println(vowel + " : " + vowelsMap.get(vowel));
        }

        System.out.println("Printing consonants and their count :");
        for (char consonant : consonantsMap.keySet()) {
            System.out.println(consonant + " : " + consonantsMap.get(consonant));
        }


    }
}
