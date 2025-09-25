package JPMC_210612765;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"flower","flow","flight"};
        String result = findLCP(input);
        System.out.println("Final result: " + result);

    }

    public static String findLCP(String[] inputString) {

        // sort the array
        Arrays.sort(inputString);
        String s1 = inputString[0];
        String s2 = inputString[inputString.length - 1];

        int index = 0;

        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return s1.substring(0, index);

    }
}
