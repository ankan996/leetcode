package StringPrac;

public class PalindromeCheck {

    public static void main(String[] args) {

        String inputString = "0P";
        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome) {
            System.out.println(inputString + " is palindrome.");
        } else {
            System.out.println(inputString + " is not palindrome.");
        }
    }

    public static boolean checkPalindrome(String s) {

        String filteredString = s.replaceAll("[^a-zA-Z]","").toLowerCase();

        int start = 0;
        int end = filteredString.length() - 1;

        while(start < end) {
            if (filteredString.charAt(start) != filteredString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
