package AmazonInterview;

public class ReverseStringDemo {
    public static void main(String[] args) {
        String input = "Ankan";
        String reverseString = reverseString(input);
        System.out.println(reverseString);
    }

    public static String reverseString(String input) {

        String filteredString = input.replaceAll("[^a-zA-Z]", " ").trim().toLowerCase();
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

        return new String(ch);
    }

}

