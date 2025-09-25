package StringPrac;
import java.util.Map;
import java.util.HashMap;

public class CountVowelsConsonantsCheck {
    public static void main(String[] args) {
        String inputString = "Hello Ja'va 123";

        Map<Character, Integer> vowelsMap = new HashMap<>();
        Map<Character, Integer> consonantsMap = new HashMap<>();

        // remove all spaces and special characters
        String filteredString = inputString.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(filteredString);

        for (int i = 0; i < filteredString.length(); i++) {
            char ch = filteredString.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowelsMap.put(ch, vowelsMap.getOrDefault(ch, 0) + 1);
            } else {
                consonantsMap.put(ch, consonantsMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Printing Vowels... ");
        for (Map.Entry<Character, Integer> entry : vowelsMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Printing Consonants... ");
        for (Map.Entry<Character, Integer> entry : consonantsMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
