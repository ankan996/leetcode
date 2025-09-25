package Java8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestInt {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(25);

        System.out.println(arrayList);

        List<Integer> resultList = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending order sorting = " + resultList);

        List<Integer> resultListComparator = arrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending order sorting = "+ resultListComparator);

        // find min and max value from the arraylist object

        Integer minValue = arrayList.stream().min(Integer::compareTo).get();
        System.out.println("Minimum Value is - " + minValue);

        Integer maxValue = arrayList.stream().max(Integer::compareTo).get();
        System.out.println("Maximum Value is - " + maxValue);

        // use toArray() to transfer each objects present inside the arrayList to a new Integer array

        Integer[] array = arrayList.stream().toArray(Integer[] :: new);

        // iterate the elements present inside the array and print the elements one by one

        for (Integer integer : array) {
            System.out.println("Printing the elements present inside the array one by one " + integer);
        }

    }


}
