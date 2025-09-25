package FreshStart_String;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        System.out.println("Result - " + isAnagram(s1, s2));

    }
    public static boolean isAnagram(String s1, String s2) {

        // Replacing anything but not any small/capital characters

        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // take all these characters into a charArray

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        // sort the characters in both the char arrays in ascending order

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // return true/false if the order of alphabets match in both the char arrays

        return Arrays.equals(ch1, ch2);

    }

}
