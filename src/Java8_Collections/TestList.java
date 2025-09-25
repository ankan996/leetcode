package Java8_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(25);

        System.out.println("Before Sorting : " + arrayList);

        Collections.sort(arrayList);
        System.out.println("After Sorting in ascending order : " + arrayList);

        Collections.sort(arrayList, new MyComparator());
        System.out.println("After Sorting in descending order : " + arrayList);

        System.out.println("------ Sorting using ternary operator ------");

        Collections.sort(arrayList, (i1,i2) -> (i1 > i2) ? +1 : (i1 < i2) ? -1 : 0);
        System.out.println("After Sorting in ascending order : " + arrayList);

        Collections.sort(arrayList, (i1,i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
        System.out.println("After Sorting in descending order : " + arrayList);

        System.out.println("------ Sorting using lambda expression ------");

        Collections.sort(arrayList, (i1,i2) -> i1.compareTo(i2));
        System.out.println("After Sorting in ascending order : " + arrayList);

        Collections.sort(arrayList, (i1,i2) -> i2.compareTo(i1));
        System.out.println("After Sorting in descending order : " + arrayList);

        System.out.println("------ Sorting using advanced lambda expression ------");

        Collections.sort(arrayList, Comparator.naturalOrder());
        System.out.println("After Sorting in ascending order : " + arrayList);

        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println("After Sorting in descending order : " + arrayList);

    }

}
