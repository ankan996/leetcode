package FreshStart_Integer;

import java.util.List;
import java.util.ArrayList;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(arr);
        System.out.println(result);
    }
    public static List<Integer> findDuplicates(int[] nums) {

        // edge case check
        if (nums == null || nums.length == 0) {
            return List.of();
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
            }

            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }


        }
        return result;
    }
}
