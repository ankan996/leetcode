package AmazonInterview2;

import java.util.Set;
import java.util.HashSet;

public class DuplicateIntegerCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        boolean result = containsDuplicates(arr);
        System.out.println(result);
    }

    public static boolean containsDuplicates(int[] arr) {
        if (arr.length == 0) return false;

        Set<Integer> object = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // check if set contains the element and return true if exists
            if (object.contains(arr[i])) {
                return true;
            } else {
                object.add(arr[i]);
            }
        }
        return false;
    }
}
