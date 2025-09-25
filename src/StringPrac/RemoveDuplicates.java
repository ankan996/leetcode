package StringPrac;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "Ankan".toLowerCase();
        String result = removeDuplicates(str);
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(seen[ch])) {
                output.append(ch);
                seen[ch] = true;
            }
        }
        return output.toString();
    }
}
