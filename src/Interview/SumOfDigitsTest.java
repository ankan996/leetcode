package Interview;

public class SumOfDigitsTest {
    public static void main(String[] args) {
        String input = "1234+";
        Character operation = input.charAt(input.length() - 1);
        System.out.println(operation);

        int result = 0;

        boolean isProduct = (operation == '*');

        if (isProduct) {
            result = 1;
        }

        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                int number = Character.getNumericValue(ch[i]);
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
