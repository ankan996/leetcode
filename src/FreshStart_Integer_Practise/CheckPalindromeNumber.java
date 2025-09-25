package FreshStart_Integer_Practise;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int num = 122;
        boolean result = checkPalindrome(num);
        System.out.println(result);

    }

    public static boolean checkPalindrome(int num) {

        int lastDigit = 0;
        int reverse = 0;
        int originalNumber = num;

        while (num != 0) {
            lastDigit = num % 10;

            // boundary check to prevent overflow or underflow

            if (reverse > Integer.MAX_VALUE/10 ||
            reverse< Integer.MIN_VALUE/10) {
                return false;
            }

            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

        if (originalNumber == reverse) {
            return true;
        } else {
            return false;
        }

    }

}
