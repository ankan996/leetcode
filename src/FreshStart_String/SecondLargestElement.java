package FreshStart_String;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // actual number can be greater than the assumed largest
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else {
                // actual number can be lesser than the assumed largest
                // but can be greater than the second largest
                if (nums[i] < largest && nums[i] > secondLargest) {
                    secondLargest = nums[i];
                }
            }
        }
        System.out.println(secondLargest);

    }
}
