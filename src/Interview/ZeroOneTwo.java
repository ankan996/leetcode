package Interview;

public class ZeroOneTwo {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 0, 2, 1, 1, 0, 0};
        int n = arr.length;
        sort(arr, n);
        printArray(arr);

    }

    public static void sort(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;

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

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
