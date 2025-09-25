package AmazonInterview;

public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String str = "Ankan";
        String result = removeDuplicates(str);
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        String filteredString = str.replaceAll("[^a-zA-Z]","").trim().toLowerCase();
        StringBuilder output = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (int i = 0; i < filteredString.length(); i++) {
            char ch = filteredString.charAt(i);
            if ( !(seen[ch]) ) {
                output.append(ch);
                seen[ch] = true;
            }
        }
        return output.toString();
    }
}
