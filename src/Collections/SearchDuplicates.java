package Collections;

import java.util.ArrayList;
import java.util.List;

public class SearchDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};

        System.out.println(findDuplicates(arr));
    }

   public static List<Integer> findDuplicates(int[] arr) {
       // edge case
       if (arr == null || arr.length == 0) {
           throw new IllegalArgumentException("Invalid input.");
       }

       List<Integer> object = new ArrayList<>();
       for (int i = 0; i < arr.length-1; i++) {
           int index = Math.abs(arr[i]) - 1;
           if (arr[index] < 0) {
               object.add(arr[i]);
           } else {
               arr[index] = -1 * arr[index];
           }
       }
       return object;
   }

}
