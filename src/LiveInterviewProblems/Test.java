package LiveInterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<Character, Integer> object = new HashMap<>();
        object.put('I', 1);
        object.put('V', 5);
        object.put('X', 10);
        object.put('L', 50);
        object.put('C', 100);
        object.put('D', 500);
        object.put('M', 1000);

        String input = "MCMXCIV";
        int result = 0;

        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            // Get the value of the current Roman numeral
            int currentVal = object.get(ch[i]);

            // If we are not at the last character and the next Roman numeral is greater,
            // subtract the current value from the result instead of adding
            if (i + 1 < ch.length) {
                int nextVal = object.get(ch[i + 1]);
                if (currentVal < nextVal) {
                    result -= currentVal; // Subtract the current value
                } else {
                    result += currentVal; // Add the current value
                }
            } else {
                // If it's the last character, just add the value
                result += currentVal;
            }
        }

        System.out.println(input + ": " + result);
    }
}
