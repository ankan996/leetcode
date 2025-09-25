package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestIntJPMC {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(25);

        System.out.println("Printing arrayList object:" + arrayList);

        // Ascending order sorting

        List<Integer> resultASC  = arrayList.stream().sorted().toList();
        System.out.println("Ascending order sorting : " + resultASC);

        // Descending order sorting

        List<Integer> resultDESC = arrayList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending order sorting : " + resultDESC);

        // find min and max value from the arraylist object

        Integer minValue = arrayList.stream().min(Integer::compareTo).get();
        System.out.println("Min Value is : " + minValue);

        Integer maxValue = arrayList.stream().max(Integer::compareTo).get();
        System.out.println("Max value is : " + maxValue);

        // use toArray() to transfer each objects present inside the arrayList to a new Integer array

        Integer[] arr = arrayList.stream().toArray(Integer[] :: new);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }

        // iterate the elements present inside the array and print the elements one by one



    }
}
