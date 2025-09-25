package FreshStart_Integer_Practise;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = lcp(strs);
        System.out.println("Final result: " + result);
    }

    public static String lcp(String[] inputString) {
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
        return s1.substring(0,index);
    }
}
