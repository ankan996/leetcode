package IntegerInterviewPrac;

public class ArrayRotationRightTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        rotateArray(arr,2);
        printArray(arr);

    }

    public static void rotateArray(int[] arr, int rotationTimes) {
        int arrayLength = arr.length;
        rotationTimes = rotationTimes % arrayLength;

        reverseArray(arr,0,arrayLength-1);
        reverseArray(arr, 0, rotationTimes - 1);
        reverseArray(arr, rotationTimes, arrayLength - 1);


    }

    public static void reverseArray(int[] arr, int start, int end) {

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
