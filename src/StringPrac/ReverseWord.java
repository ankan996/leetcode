package StringPrac;

public class ReverseWord {
    public static void main(String[] args) {
        String input = "Hello Ankan";
        // split the sentence by a space
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
        System.out.println(result);
    }
}
