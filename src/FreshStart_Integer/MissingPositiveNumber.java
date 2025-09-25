package FreshStart_Integer;

public class MissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,6,4,2,5};
        int result = firstMissingPositive(nums);
        System.out.println(result);

    }
    public static int firstMissingPositive(int[] nums) {

        // edge case check
        if (nums == null || nums.length == 0) {
            return 1;
        }

        // pre-process the array [especially for 0 & -ve numbers]
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                nums[i] = nums.length + 1;
            }
        }

        // mark the indices of the array
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (index < nums.length && nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }

        // scan the array from Left to Right
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
