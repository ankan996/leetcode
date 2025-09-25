package FreshStart_Integer_Practise;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,11,5,10,7,8};
        int target = 9;

        int[] result = findTwoIndices(nums, target);
        System.out.println("Two indices are " + result[0] + "," + result[1]);
    }

    public static int[] findTwoIndices(int[] nums, int target) {

        // edge case check
        if (nums == null || nums.length == 0 || target < 0) {
           throw new IllegalArgumentException("Invalid Input");
        }

        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            }

        }
        return result;
    }
}
