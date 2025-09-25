package Java8_2_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class TestPrac {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(200, "Deepika"));
        employeeList.add(new Employee(400, "Sunny"));
        employeeList.add(new Employee(300, "Mallika"));
        employeeList.add(new Employee(100, "Katrina"));

        System.out.println("Sorting based on employee Name:: Smart Approach...");
        System.out.println();

        employeeList.sort(Comparator.comparing(Employee::getEmployeeName));

        System.out.println(employeeList);

        System.out.println("Sorting based on employee Number:: Smart Approach...");
        System.out.println();

        employeeList.sort(Comparator.comparing(Employee::getEmployeeNumber));

        System.out.println(employeeList);

        System.out.println("Sorting based on employee Name:: Traditional Approach...");
        System.out.println();

        employeeList.sort(
                (employee1, employee2) -> employee1.getEmployeeName().compareTo(employee2.getEmployeeName())
        );

        System.out.println(employeeList);

        System.out.println("Sorting based on employee Number:: Traditional Approach...");
        System.out.println();

        employeeList.sort(
                (employee1, employee2) -> employee1.getEmployeeNumber().compareTo(employee2.getEmployeeNumber())
        );

        System.out.println(employeeList);



    }
}
