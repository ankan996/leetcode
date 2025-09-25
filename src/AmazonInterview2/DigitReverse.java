package AmazonInterview2;

public class DigitReverse {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int num = 1534236469;
        int reversed = 0;
        int digit = 0;
        while (num != 0) {
            digit = num % 10;
            if (reversed > max/10)
                System.out.println(0);
            if (reversed < min/10)
                System.out.println(0);

            reversed = (reversed * 10) + digit;
            num = num / 10;
        }
        System.out.println(reversed);
    }
}
