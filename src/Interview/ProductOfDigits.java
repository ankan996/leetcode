package Interview;

public class ProductOfDigits {

    public static void main(String[] args) {

        String input = "1234+";
        Character operation = input.charAt(input.length()-1);
        int result = 0;

        boolean isProduct = (operation == '*');

        if (isProduct){
            result = 1;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // check if ch is a digit

            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);

                if (isProduct) {
                    result = result * num;
                } else  {
                    result = result + num;
                }
            }
        }
        System.out.println(result);
    }
}
