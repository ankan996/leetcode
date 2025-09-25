package JPMC_210612765;

public class ReverseWord {
    public static void main(String[] args) {
        String input = "Hello Ankan";
        String result = getReverseWords(input);
        System.out.println(result);
    }

    public static String getReverseWords(String inputString) {
        String filteredString = inputString.replaceAll("[^a-zA-Z]", " ").trim();
        String[] words = filteredString.split(" ");
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

            result.append(new String (ch)).append(" ");

        }

        return result.toString();
    }
}
