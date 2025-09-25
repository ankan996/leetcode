package IntegerInterviewPrac;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
        System.out.println("Second largest element: " + findSecondLargest(nums));
    }

    private static int findSecondLargest(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // if the number is greater than the largest element
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                // if the number is greater than the second largest but lesser than the largest
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                  secondLargest = nums[i];
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}
