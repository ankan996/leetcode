package FreshStart_Integer_Practise;

import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        boolean containsDuplicate = containsDuplicate(arr);
        System.out.println(containsDuplicate);
    }

    public static boolean containsDuplicate(int[] arr) {

        // edge case check
        if (arr == null || arr.length == 0) {
            return false;
        }

        Set<Integer> object = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (object.contains(arr[i])) {
                return true;
            } else {
                object.add(arr[i]);
            }
        }

        return false;

    }

}
