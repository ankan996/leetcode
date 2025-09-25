package IntegerInterviewPrac;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 0, 5, 2};

        moveZeroes(arr);
        printArray(arr);

    }

    private static void moveZeroes(int[] arr) {
        // edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input.");
        }

        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                arr[left] = arr[right];
                left++;
            }
        }
        for (int i = left; i < arr.length; i++) {
           arr[i] = 0;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
