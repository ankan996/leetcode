package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestIntJPMCHYD {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(0,10,20,5,15,25));
        System.out.println("Printing arrayList object:" + arrayList);

        // Ascending order sorting
        List<Integer> ascSort = arrayList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(ascSort);

        // Descending order sorting
        List<Integer> descSort = arrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descSort);

        // find min and max value from the arraylist object
        Integer minValue = arrayList.stream().min(Integer::compareTo).get();
        System.out.println(minValue);

        Integer maxValue = arrayList.stream().max(Integer::compareTo).get();
        System.out.println(maxValue);

        // use toArray() to transfer each objects present inside the arrayList to a new Integer array
        Integer[] arr = arrayList.stream().toArray(Integer[]::new);
        // iterate the elements present inside the array and print the elements one by one
        for (Integer i : arr) {
            System.out.println(i + " ");
        }
    }
}
