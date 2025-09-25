package Interview;

import java.util.LinkedHashMap;

public class CountCharacterOccurrencesTest {
    public static void main(String[] args) {
        String str = "Ankan";
        countCharacterOccurrences(str);
    }

    private static void countCharacterOccurrences(String str) {

        String filteredString = str.replaceAll("\\s+", "").toLowerCase();
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < filteredString.length(); i++) {
            char ch = filteredString.charAt(i);
            linkedHashMap.put(ch, linkedHashMap.getOrDefault(ch, 0) + 1);
        }
        for (Character i : linkedHashMap.keySet()) {
            System.out.println(i + " : " + linkedHashMap.getOrDefault(i, 0));
        }
    }

}
