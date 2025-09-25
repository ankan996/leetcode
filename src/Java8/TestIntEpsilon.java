package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestIntEpsilon {
    public static void main(String[] args) {

        List<Integer> object = new ArrayList<>(List.of(0,10,20,5,15,25));

        // print the arrayList object
        object.stream().forEach(System.out::println);

        // Ascending order sorting
        System.out.println("Ascending order sorting");
        object.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);

        // Descending order sorting
        System.out.println(" Descending order sorting");
        object.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

        // find min and max value from the arraylist object
        System.out.println("find min and max value from the arraylist object");
        Integer min = object.stream().min(Integer::compareTo).get();
        System.out.println(min);

        Integer max = object.stream().max(Integer::compareTo).get();
        System.out.println(max);

        // use toArray() to transfer each objects present inside the arrayList to a new Integer array

        System.out.println("Using toArray()");
        Integer[] arr = object.stream().toArray(Integer[] :: new);
        for (Integer i: arr) {
            System.out.println(i);
        }


    }
}
