package FreshStart_Integer;

import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean result = containsDuplicate(nums);
        System.out.println(result);

    }

    public static boolean containsDuplicate(int[] nums) {
        // using Set data structure
        Set<Integer> set = new HashSet<>();

        // iterate the nums array using a for loop
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }


}
