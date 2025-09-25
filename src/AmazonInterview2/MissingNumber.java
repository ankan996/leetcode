package AmazonInterview2;
import java.util.List;
import java.util.ArrayList;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);

            if (arr[index - 1] > 0) {
                arr[index - 1] = arr[index - 1] * (-1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result.add(i+1);
            }
        }

        System.out.println(result);
    }
}
