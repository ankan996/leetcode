package Collections_Java;

import java.util.Comparator;

public class myComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        // type casting Object to Employee

        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        String s1 = e1.employeeName;
        String s2 = e2.employeeName;

        return s1.compareTo(s2);

    }
}
