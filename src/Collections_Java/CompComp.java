package Collections_Java;

import java.util.TreeSet;

public class CompComp {
    public static void main(String[] args) {

        Employee e1 = new Employee("nag", 100);
        Employee e2 = new Employee("balaiah", 200);
        Employee e3 = new Employee("chiru", 50);
        Employee e4 = new Employee("venki", 150);
        Employee e5 = new Employee("nag", 100);

        TreeSet<Employee> t = new TreeSet();

        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);

        System.out.println("Comparable: " + t);

        TreeSet<Employee> t1 = new TreeSet(new myComparator());

        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);

        System.out.println("Comparator: " + t1);

    }
}
