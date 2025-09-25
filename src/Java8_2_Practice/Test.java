package Java8_2_Practice;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(200, "Deepika"));
        employeeList.add(new Employee(400, "Sunny"));
        employeeList.add(new Employee(300, "Mallika"));
        employeeList.add(new Employee(100, "Katrina"));

        System.out.println("Printing the employeeList before sorting..." + employeeList);

        System.out.println("Printing the employeeList after sorting based on employeeName...");

        // traditional approach

        employeeList.sort((employee1, employee2) -> employee1.getEmployeeName().compareTo(employee2.getEmployeeName()));
        System.out.println("Printing in traditional approach..." + employeeList);

        // smart approach

        employeeList.sort(Comparator.comparing(Employee::getEmployeeName));
        System.out.println("Printing in smart approach..." + employeeList);

    }
}
