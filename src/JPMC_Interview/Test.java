package JPMC_Interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Integer> object = new ArrayList<>();

        object.add(2);
        object.add(3);
        object.add(5);
        object.add(8);
        object.add(5);

        System.out.println("Using Java 8: ");

        object.stream().sorted(Comparator.reverseOrder()).
                collect(Collectors.toList()).stream().skip(1).limit(1)
                .forEach(System.out::println);

        int[] arr = {2,3,5,8,5};

        System.out.println("Using Java logic: ");

        int first_largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first_largest) {
                second_largest = first_largest;
                first_largest = arr[i];
            } else if (arr[i] < first_largest && arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }

        System.out.println(second_largest);






    }


}
