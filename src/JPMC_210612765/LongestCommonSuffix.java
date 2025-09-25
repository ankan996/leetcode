package JPMC_210612765;

import java.util.Arrays;

public class LongestCommonSuffix {
    public static void main(String[] args) {
        String[] input = {"racing", "tracing", "acing"};
        String result = findLCS(input);
        System.out.println("Final result: " + result);

    }

    public static String findLCS(String[] inputString) {

        Arrays.sort(inputString);
        System.out.println(Arrays.toString(inputString));
        String s1 = inputString[0];
        String s2 = inputString[inputString.length - 1];
        int index = 0;
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(s1.length() - 1 - index) == s2.charAt((s2.length() - 1 - index))) {
                index++;
            } else {
                break;
            }
        }

        return s1.substring(s1.length() - index);

    }
}
