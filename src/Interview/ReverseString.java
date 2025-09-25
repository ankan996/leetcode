package Interview;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        // convert this string to a char array
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {

            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        // Converting the charArray to back to String.

        String reversed = new String(ch);
        System.out.println(reversed);
    }
}
