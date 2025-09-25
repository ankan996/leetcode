package Java8_Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
        //TreeSet<Integer> treeSet = new TreeSet<>(new MyComparator());
        //TreeSet<Integer> treeSet = new TreeSet<>((i1,i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
        //TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        TreeSet<Integer> treeSet = new TreeSet<>((i1,i2) -> -(i1.compareTo(i2)));

        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(25);
        treeSet.add(5);
        treeSet.add(20);

        //System.out.println("Ascending order sorting : " + treeSet);
        //System.out.println("Descending order sorting : " + treeSet);

        //System.out.println("------- Sorting using ternary operator -------");

        //System.out.println("Descending order sorting : " + treeSet);

        //System.out.println("------- Sorting using advanced lambda expression -------");

        //System.out.println("Descending order sorting : " + treeSet);

        System.out.println("------- Sorting using lambda expression -------");

        System.out.println("Descending order sorting : " + treeSet);



    }
}
