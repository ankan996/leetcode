package AmazonInterview2;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZerosToTheRight(arr);
        printArray(arr);


    }
    public static void moveZerosToTheRight(int[] arr) {
        if (arr.length == 0) return;

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
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
