package JPMC_210612765;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairs {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 0;

        int result = findKdiffPairs(nums, k);
        System.out.println(result);
    }

    public static int findKdiffPairs(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k < 0) {
            throw new IllegalArgumentException("Invalid input...");
        }

        Map<Integer, Integer> mapObject = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapObject.put(nums[i], mapObject.getOrDefault(nums[i], 0) + 1);
        }

        int count = 0;

        for (Map.Entry<Integer, Integer> entry : mapObject.entrySet()) {

            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                // add K with every key
                // check if the value exists as a key
                // increment the count

                if (mapObject.containsKey(k + entry.getKey())) {
                    count++;
                }
            }

        }

        return count;

    }
}
