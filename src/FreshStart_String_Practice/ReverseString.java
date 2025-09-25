package FreshStart_String_Practice;

public class ReverseString {

    public static void main(String[] args) {
        String input = "ankan";
        String reversedString = getReversedString(input);
        System.out.println(reversedString);

    }

    public static String getReversedString(String input) {

        String cleanedInput = input.replaceAll("[^a-zA-z]"," ").toLowerCase();
        char[] ch = cleanedInput.toCharArray();

        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        String reveredString = new String(ch);
        return reveredString;



    }
}

