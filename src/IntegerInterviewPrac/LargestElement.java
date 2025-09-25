package IntegerInterviewPrac;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 0, 99, -40};
        int largestNumber = largestNumber(nums);
        System.out.println(largestNumber);

    }

    public static int largestNumber(int[] nums) {
        //edge case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid Input.");
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

}
