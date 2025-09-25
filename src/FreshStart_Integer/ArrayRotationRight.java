package FreshStart_Integer;

public class ArrayRotationRight {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(nums, k);
        printArray(nums);

    }
    public static void rotateArray(int[] nums, int k) {

        int arrayLength = nums.length;
        k = k % arrayLength;

        // reverse the entire array
        reverseArray(nums, 0, arrayLength - 1);

        // reverse the array till the kth element
        reverseArray(nums, 0, k - 1);

        // reverse the remaining part of the array
        reverseArray(nums, k, arrayLength - 1);
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
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
