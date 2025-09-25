package FreshStart_String;

public class LengthLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        int length = getLengthOfLastWord(s);
        System.out.println(length);

    }

    public static int getLengthOfLastWord(String s) {
        // edge case check
        if (s == null || s.isBlank()) {
            return 0;
        }

        int right = s.length() - 1;
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }
        int left = right;
        while (left >= 0 && s.charAt(left) != ' ') {
            left--;
        }
        return right - left;
    }
}
