package Interview;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "Programming";
        String result = removeDuplicates(str);
        System.out.println(result);

    }

    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder output = new StringBuilder();

        // iterate the entire string
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
