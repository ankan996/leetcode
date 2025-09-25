package test_jpmc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test6 {

    public static void main(String[] args) {
        String str = "ABCABCABCABC";

        String cleanedString = str.replaceAll("[^a-zA-z]"," ").trim().toLowerCase();
        char[] ch = cleanedString.toCharArray();

        Arrays.sort(ch);

        String sortedString = Arrays.toString(ch);

        System.out.println(sortedString);

        for (int i = 0; i < sortedString.length(); i++) {



        }





        /*Map<Character, Integer> chCount = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
                chCount.put(ch[i], chCount.getOrDefault(ch[i], 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : chCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println(chCount);*/
    }
}
