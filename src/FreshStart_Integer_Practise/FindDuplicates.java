package FreshStart_Integer_Practise;
import java.util.LinkedList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = duplicateNumbers(arr);
        System.out.println(result);

    }

    public static List<Integer> duplicateNumbers(int[] arr) {

        List<Integer> result = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                result.add(Math.abs(arr[i]));
            } else {
                arr[index] = -1 * arr[index];
            }
        }

        return result;
    }
}
