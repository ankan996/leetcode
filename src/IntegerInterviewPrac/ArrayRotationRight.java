package IntegerInterviewPrac;

public class ArrayRotationRight {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(nums, k);
        printArray(nums);
    }
    public static void rotateArray(int[] nums, int k) {

        // in case k is larger than the length of the array
        int arrLength = nums.length;
        k = k % arrLength;

        // reverse the entire array
        reverseArray(nums, 0, arrLength-1 );

        // reverse the first half of the array : (0 - k-1)
        reverseArray(nums, 0, k-1);

        // reverse the second half of the array (k - arr.length-1)
        reverseArray(nums, k, arrLength-1);

    }

    public static void reverseArray(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
