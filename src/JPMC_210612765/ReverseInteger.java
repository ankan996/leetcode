package JPMC_210612765;

public class ReverseInteger {
    public static void main(String[] args) {
        int input = -123;
        int result = reversedInteger(input);
        System.out.println(result);
    }

    public static int reversedInteger(int input) {
        int reversed = 0, lastDigit = 0;

        while (input != 0) {
            lastDigit = input % 10;
            // boundary check to prevent overflow or underflow
            if (reversed > Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10) {
                return 0;
            }

            reversed = (reversed * 10) + lastDigit;
            input = input / 10;

        }
        return reversed;
    }

}
