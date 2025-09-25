package StringPrac;

public class WordCounter {

    public static void main(String[] args) {
        String inputStr = "This is a simple Java program to count words.";

        System.out.println(countWords(inputStr));
    }
    public static int countWords(String inputStr) {
        // edge check
        if (inputStr == null || inputStr.isEmpty()) {
            return 0;
        }
        String[] words = inputStr.trim().split("\\s+");
        return words.length;
    }
}
