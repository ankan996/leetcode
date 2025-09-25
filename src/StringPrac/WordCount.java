package StringPrac;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        String inputString = "Anka'n is is a good GOOD Java Developer.";
        Map<String, Integer> wordCountMap = wordCounter(inputString);

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static Map<String, Integer> wordCounter(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        // edge case check
        if (sentence == null || sentence.isEmpty()) {
            return wordCountMap;
        }

        String[] words = sentence.trim().toLowerCase().split("\\s+");

        for (String word : words) {
            // check for punctuation marks if any
            word = word.replaceAll("[^a-zA-Z]","");
            // check if the word is not empty after removing the punctuation marks
            if (!(word.isEmpty())) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }
}