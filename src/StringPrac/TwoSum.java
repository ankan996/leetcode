package StringPrac;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,11,5,10,7,8};
        int[] result = twoSum(numbers, 9);
        System.out.println(result[0] + "," +result[1]);
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        // edge case
       if (arr == null || target == -1) {
          return result;
       }
       Map<Integer, Integer> map = new HashMap<>();

       for (int i = 0; i < arr.length; i++) {
           if (!(map.containsKey(target - arr[i]))) {
               map.put(arr[i], i);
           } else {
               result[1] = i;
               result[0] = map.get(target - arr[i]);
           }
       }
        return result;
    }
}
