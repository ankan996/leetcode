package Java8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(200, "Deepika"));
        employeeList.add(new Employee(400, "Sunny"));
        employeeList.add(new Employee(300, "Mallika"));
        employeeList.add(new Employee(100, "Katrina"));


        System.out.println("Before Sorting : " + employeeList);

        System.out.println();

        Collections.sort(employeeList,
                (employee1, employee2) -> employee1.getEmployeeName()
                        .compareTo(employee2.getEmployeeName()));

        System.out.println("After Sorting : " + employeeList);

    }

}
