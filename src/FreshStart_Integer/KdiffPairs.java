package FreshStart_Integer;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairs {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 4, 1, 5};
        int k1 = 2;
        System.out.println("Output: " + findPairs(nums1, k1));  // Output: 2

        /*int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 1;
        System.out.println("Output: " + findPairs(nums2, k2));  // Output: 4

        int[] nums3 = {1, 3, 1, 5, 4};
        int k3 = 0;
        System.out.println("Output: " + findPairs(nums3, k3));  // Output: 1*/
    }

    public static int findPairs(int[] nums, int k) {

        // edge case check
        if (nums.length == 0 || nums == null || k < 0) {
            return 0;
        }

        // create the hashmap
        Map<Integer, Integer> objectMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            objectMap.put(nums[i], objectMap.getOrDefault(nums[i], 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : objectMap.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (objectMap.containsKey(k + entry.getKey())) {
                count++;
            }
            }

        }
        return count;
    }
}
