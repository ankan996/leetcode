package JPMC_210612765;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> result = findDuplicateNumbers(nums);
        System.out.println(result);
    }

    public static List<Integer> findDuplicateNumbers(int[] nums) {
        // edge case check
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid Input !!!");
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            } else {
                result.add(Math.abs(nums[i]));
            }
        }

        return result;
    }
}
