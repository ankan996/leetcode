package AmazonInterview2;

public class FindMinInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        // 3 base cases
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.min(nums[0], nums[1]);
        if (nums[0] < nums[nums.length - 1]) return nums[0];

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // if the array is decreasing at mid + 1
            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
            // if the array is decreasing at mid
            if (nums[mid-1] > nums[mid]) return nums[mid];
            // discard the sorted part of the array (or) the increasing part of the array
            if (nums[left] < nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0;


    }
}
