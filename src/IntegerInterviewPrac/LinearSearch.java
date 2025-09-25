package IntegerInterviewPrac;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 10, 15, 20};
        int lengthOfArray = arr.length;;
        LinearSearch ls = new LinearSearch();
        int target = 15;

        int index = ls.search(arr, lengthOfArray, target);

        if (index > 0) {
            System.out.println(target + " is found at index " + index + ".");
        } else {
            System.out.println(target + " is not found inside the given array.");
        }
    }


    public int search(int[] arr, int lengthOfArray, int target) {
        // check edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input !!!");
        }
        for (int i = 0; i < lengthOfArray; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
