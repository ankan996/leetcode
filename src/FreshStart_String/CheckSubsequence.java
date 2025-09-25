package FreshStart_String;

public class CheckSubsequence {
    public static void main(String[] args) {

        String s = "axc", t = "ahbgdc";
        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }

    public static boolean isSubsequence(String s, String t) {

        int p1 = 0;
        int p2 = 0;

        while (p1 < s.length() && p2 < t.length()) {
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        return p1 == s.length();
    }
}
