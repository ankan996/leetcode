package AmazonInterview;

public class move {

    public static void sortArray(int[] arr, int n) {

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else {
                if (arr[mid] == 1) {
                    mid++;
                } else {
                    if (arr[mid] == 2) {
                        // swap arr[mid] and arr[high]
                        int temp = arr[mid];
                        arr[mid] = arr[high];
                        arr[high] = temp;

                        high--;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int n = 6;
        int[] arr = {0, 2, 1, 2, 0, 1};
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
