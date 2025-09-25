package FreshStart_Integer;

public class OperationOnDigits {
    public static void main(String[] args) {
        String input = "1234+";
        Character operation = input.charAt(input.length() - 1);
        System.out.println(operation);
        boolean isProduct = (operation == '*');

        int result = 0;
        int number = 0;

        if (isProduct) {
            result = 1;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                // get me the numeric value
                number = Character.getNumericValue(ch);
                if (isProduct) {
                    result = result * number;
                } else {
                    result = result + number;
                }
            }
        }
        System.out.println(result);
    }
}
