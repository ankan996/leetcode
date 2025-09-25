package FreshStart_String_Practice;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = checkPalindrome(s);
        System.out.println(result);
    }

    public static boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {

            char c1 = s.charAt(start);
            char c2 = s.charAt(end);

            if (!Character.isLetterOrDigit(c1)) {
                start++;
            } else if (!Character.isLetterOrDigit(c2)) {
                end--;
            } else if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return  false;
            } else {
                start++;
                end--;
            }

        }

        return true;


    }
}
