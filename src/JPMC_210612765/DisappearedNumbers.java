package JPMC_210612765;

import java.util.List;
import java.util.ArrayList;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // edge case check
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid Input !!!");
        }

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = - 1 * nums[index];
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
