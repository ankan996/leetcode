package StringPrac;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        if (areAnagrams(str1,str2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams!");
        } else {
            System.out.println(str1 + " and " + str2 + " are not Anagrams!");
        }

    }
    public static boolean areAnagrams(String str1, String str2) {
        // replace any unwanted things from the String

        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        // check for length

        if (str1.length() != str2.length()) {
            return false;
        }
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            // sort the char arrays alphabetically
            Arrays.sort(ch1);
            Arrays.sort(ch2);


        return Arrays.equals(ch1,ch2);
    }
}
