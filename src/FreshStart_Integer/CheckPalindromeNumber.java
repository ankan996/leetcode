package FreshStart_Integer;

public class CheckPalindromeNumber {
    public static void main(String[] args) {

        int inputNumber = -121;
        boolean result = checkPalindrome(inputNumber);
        System.out.println(result);
    }

    public static boolean checkPalindrome(int nums) {

        int original = nums;
        int lastDigit = 0;
        int reversed = 0;

        // check for negative inputs

        if (nums < 0) return false;

        while (nums != 0) {

            lastDigit = nums % 10;

            // boundary check to prevent overflow and underflow

            if (reversed > Integer.MAX_VALUE/10 ||
            reversed < Integer.MIN_VALUE/10) {
                return false;
            }
            reversed = (reversed * 10) + lastDigit;
            nums = nums / 10;
        }

        if (original == reversed) {return true;} else {return  false;}

    }

    }