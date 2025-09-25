package JPMC_210612765;

public class CheckPalindromeNumber {
    public static void main(String[] args) {

        int input = 122;

        boolean result = palindromeCheck(input);
        System.out.println(result);

    }

    public static boolean palindromeCheck(int input) {
        int originalNumber = input;

        int lastDigit = 0;
        int reversed = 0;

        while (input != 0) {
            lastDigit = input % 10;

            // boundary check for overflow/underflow cases
            if (reversed > Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10) {
                return false;
            }

            reversed = (reversed * 10) + lastDigit;
            input = input / 10;
        }

        if (originalNumber == reversed) {
            return true;
        } else {
            return false;
        }

    }
}
