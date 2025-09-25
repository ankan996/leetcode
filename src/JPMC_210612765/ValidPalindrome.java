package JPMC_210612765;

public class ValidPalindrome {
    public static void main(String[] args) {
        String inputStr = "A man, a plan, a canal: Panama";
        boolean result = checkPalindrome(inputStr);
        System.out.println(result);
    }

    public static boolean checkPalindrome(String inputStr) {
        int start = 0;
        int end = inputStr.length() - 1;

        while (start <= end) {

            char c1 = inputStr.charAt(start);
            char c2 = inputStr.charAt(end);

            if (!Character.isLetterOrDigit(c1)) {
                start++;
            } else if (!Character.isLetterOrDigit(c2)) {
                end--;
            } else if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
