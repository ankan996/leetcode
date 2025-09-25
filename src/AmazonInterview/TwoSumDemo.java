package AmazonInterview;

import java.util.HashMap;
import java.util.Map;

public class TwoSumDemo {
    public static void main(String[] args) {
        int[] numbers = {2,11,5,10,7,8};
        int[] result = twoSum(numbers, 9);
        System.out.println(result[0] + "," +result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!resultMap.containsKey(target - nums[i])) {
                resultMap.put(nums[i], i);
            } else {
                result[1] = i;
                result[0] = resultMap.get(target - nums[i]);
            }
        }

        return result;
    }
}
