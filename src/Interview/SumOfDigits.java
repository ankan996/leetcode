package Interview;

public class SumOfDigits {
    public static void main(String[] args) {
        String input = "1234*";
        int result = 0;
        // Get the last character to know the operation type
        Character operation = input.charAt(input.length() - 1);
        boolean isProduct = (operation == '*');

        if (isProduct){
            result = 1;
        }


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a digit

            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
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
