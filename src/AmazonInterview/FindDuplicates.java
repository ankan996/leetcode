package AmazonInterview;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index - 1] < 0) {
                result.add(index);
            } else {
                arr[index - 1] = arr[index - 1] * (-1);
            }
        }
        System.out.println(result);
    }
}
