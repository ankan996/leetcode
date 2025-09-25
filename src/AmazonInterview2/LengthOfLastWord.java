package AmazonInterview2;

public class LengthOfLastWord {
    public static void main(String[] args) {
      String arr = "Hello World";
      int result = calculateLengthOfLastWord(arr);
      System.out.println(result);
    }

    public static int calculateLengthOfLastWord(String input) {
        int right = input.length() - 1;
        while (right >= 0 && input.charAt(right) == ' ') {
            right--;
        }
        int left = right;
        while (left >= 0 && input.charAt(left) != ' ') {
            left--;
        }

        return right - left;
    }

}
