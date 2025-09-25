package JPMC_210612765;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean result = containsDuplicates(arr);
        System.out.println(result);
    }

    public static boolean containsDuplicates(int[] arr) {
        // edge case check
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input !!!");
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
