package AmazonInterview2;

public class CheckPalindromeInteger {
    public static void main(String[] args) {

        int originalNumber = 123;
        boolean result = isPalindrome(originalNumber);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        int originalNumber = x;
        int reversedNumber = 0, lastDigit = 0;

        while (x != 0) {
            lastDigit = x % 10;
            if (reversedNumber > max/10) return false;
            if (reversedNumber < min/10) return false;

            reversedNumber = (reversedNumber * 10) + lastDigit;
            x = x / 10;
        }

        return (originalNumber == reversedNumber);


    }
}
