package LiveInterviewProblems;

public class Dexian {

    public static void main(String[] args) {

        //int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 30;

        int index =  searchIndex(arr, target);
        if (index > 0) {
            System.out.println(target + " is found at index: " + index);
        } else {
            System.out.println(target + " is not found.");
        }

    }

    public static int searchIndex(int[] arr, int target) {

        // checking edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input.");
        }

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;

    }

}
