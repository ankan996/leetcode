package StringPrac;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello Ankan";
        // convert this String to a char array
        char[] ch = input.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        // convert the char array back to string
        String reversed = new String(ch);
        System.out.println(reversed);
    }
}
