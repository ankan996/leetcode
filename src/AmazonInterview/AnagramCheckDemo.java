package AmazonInterview;

import java.util.Arrays;

public class AnagramCheckDemo {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        System.out.println(isAnagram(s1,s2));

    }

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.replaceAll("[^a-zA-Z]", " ").trim().toLowerCase();
        s2 = s2.replaceAll("[^a-zA-z]", " ").trim().toLowerCase();

        // convert to char array

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        // sort the char arrays

        Arrays.sort(c1);
        Arrays.sort(c2);

        // check for equality

        return Arrays.equals(c1,c2);





    }
}
