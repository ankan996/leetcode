package AmazonInterview2;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 123;
        int result = reverse(num);
        System.out.println(result);

    }

    public static int reverse(int num) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int reversed = 0;
        int lastDigit = 0;

        while (num != 0) {
            lastDigit = num % 10;
            if (reversed > max/10) return 0;
            if (reversed < min/10) return 0;
            reversed = (reversed * 10) +  lastDigit;
            num = num / 10;
        }

        return reversed;

    }
}
