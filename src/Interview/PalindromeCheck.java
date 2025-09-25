package Interview;

public class PalindromeCheck {
    public static void main(String[] args) {

        String inputString = "ankan".toLowerCase();
        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else System.out.println("Not Palindrome");
    }

    public static boolean checkPalindrome(String inputString) {
        int start = 0;
        int end = inputString.length() - 1;
        while (start < end) {
            if (inputString.charAt(start) != inputString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
