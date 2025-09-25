package FreshStart_Integer_Practise;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = -123;
        int result = getReverseNumber(num);
        System.out.println(result);
    }

    public static int getReverseNumber(int num) {
        int lastDigit = 0;
        int reverse = 0;

        while (num != 0) {

            lastDigit = num % 10;

            // boundary check to prevent overflow or underflow
            if (reverse > Integer.MAX_VALUE/10 ||
            reverse < Integer.MIN_VALUE/10) {
                return 0;
            }

            reverse = (reverse * 10) + lastDigit;
            num = num / 10;

        }

        return reverse;
    }

}
