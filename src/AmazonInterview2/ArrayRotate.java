package AmazonInterview2;

public class ArrayRotate {
    public static void main(String[] args) {
        int[] numsRight = {1,2,3,4,5,6};

        System.out.println("Rotating the array to the right by " + 2 + " times.");
        rotateRight(numsRight, 2);
        printArray(numsRight);

        int[] numsLeft = {1,2,3,4,5,6};

        System.out.println("Rotating the array to the left by " + 2 + " times.");
        rotateLeft(numsLeft, 2);
        printArray(numsLeft);

    }

    public static void rotateRight(int[] nums, int rotation) {
        if (nums == null || rotation == -1) {
            return;
        }

        rotation = rotation % nums.length;

        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, rotation - 1);
        reverseArray(nums, rotation, nums.length - 1);

    }

    public static void rotateLeft(int[] nums, int rotation) {
        if (nums == null || rotation == -1) {
            return;
        }

        reverseArray(nums, 0, rotation - 1);
        reverseArray(nums, rotation, nums.length -1);
        reverseArray(nums, 0, nums.length - 1);
    }

    public static void printArray(int[] nums) {
        if (nums == null) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] nums, int start, int end) {
        if (nums == null || start == -1 || end == -1) {
            return;
        }
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


}
