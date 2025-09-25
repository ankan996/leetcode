package AmazonInterview;

public class SecondLargestElementDemo {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
        System.out.println("Second largest element: " + findSecondLargest(nums));
    }

    public static int findSecondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // if the nums[i] is greater than the assumed largest
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else {
                // if the nums[i] is greater than the assumed second largest but lesser than the assumed largest
                if (nums[i] > secondLargest && nums[i] < largest) {
                    secondLargest = nums[i];
                }
            }

        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;

    }
}
