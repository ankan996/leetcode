package FreshStart_Integer_Practise;

import java.util.Map;

public class RomanIntegerPrac {
    public static void main(String[] args) {
        Map<Character, Integer> romanMap = Map.of(
                'I', 1, 'V', 5, 'X', 10,
                'L',50, 'C', 100, 'D', 500,
                'M', 1000
        );
        String s = "MMXXV";

        int totalValue = 0;
        int currentValue = 0;

        for (int i = 0; i < s.length(); i++) {
            currentValue = romanMap.get(s.charAt(i));
            if (i < s.length() - 1 && currentValue < romanMap.get(s.charAt(i + 1))) {
                totalValue = totalValue - currentValue;
            } else {
                totalValue = totalValue + currentValue;
            }
        }
        System.out.println(totalValue);
    }
}
