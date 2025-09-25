package AmazonInterview;

public class ReverseWord {
    public static void main(String[] args) {
        String input = "Hello Ankan";
        System.out.println(revWord(input));
    }

    public static String revWord(String input) {
        // edge case
        if (input.isEmpty()) {
            return "Invalid input...";
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char[] ch = word.toCharArray();
            int start = 0;
            int end = ch.length - 1;

            while (start < end) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            result.append(new String(ch)).append(" ");
        }


        return result.toString();
    }
}
