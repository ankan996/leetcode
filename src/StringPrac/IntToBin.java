package StringPrac;

public class IntToBin {
    public static void main(String[] args) {
        int number = 18;

        String result = convertToBinary(number);
        System.out.println("Binary of " + number + " is: " + result);

    }

    public static String convertToBinary(int number) {

        if (number == 0) {
            return "0";
        }
        StringBuilder object = new StringBuilder();

        while (number > 0) {
            // get the remainder appended in a StringBuilder object
            object.append(number % 2);
            // divide the number '/2' to get the Quotient
            number = (number / 2);
        }

        System.out.println("Printing the object... " + object);
        return object.reverse().toString();

    }
}
