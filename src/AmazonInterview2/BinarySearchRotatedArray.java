package AmazonInterview2;

public class BinarySearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = bsra(arr, target);
        if (index > 0) {
            System.out.println(target + " is found at index: " + index);
        } else {
            System.out.println(target + " is not found.");
        }
    }

    public static int bsra(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) return mid;

            if (nums[left] <= nums[mid]) { // left to right is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // mid to right is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;

    }


}
