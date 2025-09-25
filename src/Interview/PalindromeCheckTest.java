package Interview;

public class PalindromeCheckTest {

    public static void main(String[] args) {
        String inputString = "Madam".toLowerCase();
        boolean isPalindrome = checkPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean checkPalindrome(String inputString) {

        int start = 0;
        int end  = (inputString.length()-1);

        char[] charArray = inputString.toCharArray();

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            } else {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }
        return true;
    }

}


