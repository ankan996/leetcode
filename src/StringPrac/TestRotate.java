package StringPrac;

public class TestRotate {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int rotation = 2;
        rotateRight(arr, rotation);
        printArray(arr);
    }

    public static void rotateRight(int[] arr, int rotation) {

        int arrayLength = arr.length -1;
        rotation = rotation % arrayLength;

        reverseArray(arr, 0, arrayLength);
        reverseArray(arr, 0, rotation - 1);
        reverseArray(arr, rotation, arrayLength);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }







}
