package Collections;

public class ArrayRotationLeftINT {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;

        rotateArray(nums, k);
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    private static void rotateArray(int[] nums, int k) {
        int arrayLength = nums.length;
        k = k % arrayLength;

        // reverse till k
        reverseArray(nums, 0, k-1);

        // reverse till k - array length
        reverseArray(nums, k, arrayLength-1);

        // reverse the entire array
        reverseArray(nums, 0, arrayLength-1);


    }
}
