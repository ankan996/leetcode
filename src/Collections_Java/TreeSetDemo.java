package Collections_Java;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet t = new TreeSet(new myComparator());
        /*t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");
        t.add(null);*/

        /*t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));*/

        //System.out.println(t);

        /*System.out.println("Z".compareTo("A"));
        System.out.println("A".compareTo("K"));
        System.out.println("Z".compareTo("Z"));*/

        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);

        System.out.println(t);



    }
}
