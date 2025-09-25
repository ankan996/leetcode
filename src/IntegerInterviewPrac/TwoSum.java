package IntegerInterviewPrac;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] numbers = {2, 11, 5, 10, 7, 8};
        int[] result = twoSum(numbers, 9);

        System.out.println("The two indices are - " + result[0] + " and " + result[1]);
    }

    private static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> object = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (!(object.containsKey(target - numbers[i]))) {
                object.put(numbers[i],i);
            } else {
                result[1] = i;
                result[0] = object.get(target - numbers[i]);
            }
        }

        return result;

    }
}
