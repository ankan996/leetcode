package FreshStart_Integer;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // expected o/p = 2
        int result = removeDuplicates(nums);
        System.out.println(result);

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }

        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left + 1;
    }
}
