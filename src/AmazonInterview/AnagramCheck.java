package AmazonInterview;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        System.out.println(isAnagram(s1,s2));

    }

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.replaceAll("[^a-zA-Z]", "").trim().toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").trim().toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(ch1);
        System.out.println(ch2);

        return Arrays.equals(ch1, ch2);

    }
}
