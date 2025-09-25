package StringPrac;

public class ProductOfDigits {
    public static void main(String[] args) {
        String input = "1234*";
        Character operation = input.charAt(input.length() - 1);
        boolean isProduct = (operation == '*');
        int result = 0;
        int num = 0;
        if (isProduct) {
            result = 1;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                num = Character.getNumericValue(ch);

                if (isProduct) {
                    result = result * num;
                } else {
                    result = result + num;
                }
            }
        }
        System.out.println(result);
    }
}