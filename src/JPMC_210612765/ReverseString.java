package JPMC_210612765;

public class ReverseString {
    public static void main(String[] args) {

        String inputString = "  Ankan  !! ";
        String reversedString = getReversedString(inputString);
        System.out.print(reversedString);

    }

    public static String getReversedString(String inputString) {

        String cleanedString = inputString.replaceAll("[^a-zA-Z]", " ").toLowerCase().trim();
        char[] ch = cleanedString.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        // convert the character array into a String Object

        return new String(ch);

    }
}
