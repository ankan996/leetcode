package IntegerInterviewPrac;

import java.util.LinkedHashMap;

public class WordCount {
    public static void main(String[] args) {

        String input = "Ankan Ankan is is a very good good java java java developer developer.";
        String[] words = input.split("\\s+");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            word = word.replaceAll("\\p{Punct}", "");
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // printing the map object

        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }

    }
}
