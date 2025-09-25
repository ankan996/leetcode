package FreshStart_String;

public class ReverseString {
    public static void main(String[] args) {
        String input = "mohor";
        String reversedString = getReversedString(input);
        System.out.println(reversedString);

    }


    public static String getReversedString(String input) {

        // edge case check
        if (input == null || input.isBlank()) {
            return "No input String provided.";
        }

        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // convert the cleanedInput String into a char Array

        char[] ch = cleanedInput.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            // reverse logic starts
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        String reversedString = new String(ch);
        return reversedString;
    }

}
