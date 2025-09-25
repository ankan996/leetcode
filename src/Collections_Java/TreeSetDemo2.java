package Collections_Java;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(new myComparator());
        t.add("Roja");
        t.add("ShobhaRani");
        t.add("Rajakumari");
        t.add("GangaBhavani");
        t.add("Ramulamma");

        System.out.println(t);
    }
}
