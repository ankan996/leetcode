package FreshStart_String_Practice;

public class RemoveDuplicatesStringDemo {
    public static void main(String[] args) {
        String input = "Ankan";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String input) {
        // edge case check
        if (input == null || input.isBlank()) {
            return "Invalid input ...";
        }


        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").trim().toLowerCase();

        boolean[] seen = new boolean[256];
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < cleanedInput.length(); i++) {
            char ch = cleanedInput.charAt(i);
            if (!seen[ch]) {
                output.append(ch);
                seen[ch] = true;
            }
        }

        return output.toString();


    }
}
