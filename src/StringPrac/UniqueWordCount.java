package StringPrac;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCount {
    public static void main(String[] args) {
        String input = "Ankan ankan is a very very good boy.";
        Map<String, Integer> wordCountMap = wordCounter(input);

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> wordCounter(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = input.trim().toLowerCase().split("\\s+");

        for (String word : words) {
            // remove punctuation marks if any
            word = word.replaceAll("[^a-zA-Z]", "");
            // check if the word is not empty
            if (!(word.isEmpty())) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }
}
