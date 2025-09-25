package FreshStart_String;

public class ReverseWord {
    public static void main(String[] args) {
        String input = "Hello Ankan";
        String result = getReverseWords(input);
        System.out.println(result);
    }

    public static String getReverseWords(String input) {

        // edge case check
        if (input == null || input.isBlank()) {
            return "Input String is not valid.";
        }

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // pick one word at a time & convert to a char array
            // then reverse it and put it inside a StringBuilder object: result

            char[] ch = word.toCharArray();
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
            // now append the reversed word in StringBuilder object: result
            result.append(new String(ch)).append(" ");
        }
        // return the result by converting to a String object.
        return result.toString();
    }

}
