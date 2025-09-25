package Collections_Java;

import java.util.TreeSet;

public class TreeSetDemo3 {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new myComparator());

        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");

        System.out.println(t);

    }
}
