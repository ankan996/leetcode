package FreshStart_Integer_Practise;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairs {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int result = findPairs(nums, k);
        System.out.println(result);
    }

    public static int findPairs(int[] nums, int k) {

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
                // add k with every key
                // check if the result is present as a key inside the hashmap
                // increment the counter

                if (mapObject.containsKey(k + entry.getKey())) {
                    count++;
                }

            }
        }
        return count;
    }
}
