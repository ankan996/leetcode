package AmazonInterview;

public class RemoveDuplicatesInteger {
    public static void main(String[] args) {
        int[] nums = {-2, 2, 4, 4, 4, 4, 5, 5};
        System.out.println(removeDups(nums));
    }

    public static int removeDups(int [] arr) {
        int left = 0, right = 0;
        while (right < arr.length) {
            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }
            right++;
        }
        return left+1;
    }
}
