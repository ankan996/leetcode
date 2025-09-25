package Interview;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {

        String str1 = "Silent";
        String str2 = "Listen";

        if (areAnagrams(str1,str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams !!!");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams !!!");
        }

    }
    private static boolean areAnagrams(String str1, String str2) {

        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);




    }
}
