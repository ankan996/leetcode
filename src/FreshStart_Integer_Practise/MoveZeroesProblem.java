package FreshStart_Integer_Practise;

public class MoveZeroesProblem {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        printArray(nums);

    }

    public static int[] moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }

        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }

    public static void printArray(int[] nums) {
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
    }



}
