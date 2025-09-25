package AmazonInterview;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Ankan";
        String reverseString = reverseString(input);
        System.out.println(reverseString);
    }

    public static String reverseString(String input) {
        // edge case
        if (input == null || input.isBlank()) {
            return "No input String provided.";
        }

        String filteredString = input.replaceAll("\\s+","").trim().toLowerCase();
        char[] ch = filteredString.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
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
