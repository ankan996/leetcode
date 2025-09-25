package AmazonInterview2;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-1,0,3,5,9,12};
        int target = 2;

        int index = bs(arr, target);
        if (index > 0) {
            System.out.println(target + " is found at index: " + index);
        } else {
            System.out.println(target + " is not found.");
        }
    }

    public static int bs(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
