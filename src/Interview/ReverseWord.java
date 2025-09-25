package Interview;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Hello Ankan";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char[] charArray = word.toCharArray();

            int start = 0;
            int end = charArray.length - 1;

            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
            result.append(new String(charArray)).append(" ");
        }

        System.out.println(result.toString().trim());

    }
}
