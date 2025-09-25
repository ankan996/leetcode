package FreshStart_Integer;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,11,5,10,7,8};
        int target = 9;
        int[] result = getTwoSum(nums, target);
        System.out.println(result[0] + "," + result[1]);

    }

    public static int[] getTwoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> objectMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!objectMap.containsKey(target - nums[i])) {
                objectMap.put(nums[i], i);
            } else {
                result[1] = i;
                result[0] = objectMap.get(target - nums[i]);
            }
        }
        return result;
    }




}
