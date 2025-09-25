package Interview;

public class ReverseStringTest {
    public static void main(String[] args) {
        String str = "Hello Ankan";
        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        // converting char array to a String object and printing the reversed string.
        String reversed = new String(charArray);
        System.out.println(reversed);

    }
}
