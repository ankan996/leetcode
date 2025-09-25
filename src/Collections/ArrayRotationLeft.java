package Collections;

public class ArrayRotationLeft {

    public static void main(String[] args) {

        //int[] nums = {1, 2, 3, 4, 5};
        //int k = 3;

        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;

        rotateArray(nums, k);
        printArray(nums);
    }

    public static void rotateArray(int[] nums, int k) {

        int arrayLength = nums.length;
        k = k % arrayLength;

        // reverse the array till k
        reverseArray(nums, 0, k - 1);
        // reverse the array till k to length of the array
        reverseArray(nums, k, arrayLength - 1);
        // reverse the entire array
        reverseArray(nums, 0, arrayLength - 1);

    }

    public static void reverseArray(int[] nums, int start, int end) {
        // edge case

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input.");
        }

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


}
