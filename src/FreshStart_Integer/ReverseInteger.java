package FreshStart_Integer;

public class ReverseInteger {
    public static void main(String[] args) {

        int inputNumber = 123;
        int result = reverseInteger(inputNumber);
        System.out.println(result);
    }
    public static int reverseInteger(int inputNumber) {

        int reversed = 0;
        int lastDigit = 0;

        while (inputNumber != 0) {
            lastDigit = inputNumber % 10;
            if (reversed > Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10) {
                return 0;
            }
            reversed = (reversed * 10) + lastDigit;
            inputNumber = inputNumber/10;
        }
        return reversed;
    }
}
