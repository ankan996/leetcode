package Java8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainJPMC {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(200, "Deepika"));
        employeeList.add(new Employee(400, "Sunny"));
        employeeList.add(new Employee(300, "Mallika"));
        employeeList.add(new Employee(100, "Katrina"));

        // Printing the arraylist object by iterating

        System.out.println("Printing the arraylist object by iterating");

        employeeList.stream().forEach(employee -> System.out.println("EmployeeNumber: " + employee.getEmployeeNumber() +
                " | " + "EmployeeName: " + employee.getEmployeeName()
        ));

        System.out.println();

        // Ascending order Sorting based on Employee Number

        System.out.println("Ascending order Sorting based on Employee Number");

        employeeList.stream().sorted(Comparator.comparingInt(Employee::getEmployeeNumber)).forEach(employee -> System.out.println(
                "EmployeeNumber: " + employee.getEmployeeNumber() + " | " + "EmployeeName: " + employee.getEmployeeName()
        ));

        System.out.println();

        // Descending order Sorting based on Employee Number

        System.out.println("Descending order Sorting based on Employee Number");

        employeeList.stream().sorted((e1,e2) -> (e2.getEmployeeNumber()) - e1.getEmployeeNumber()).forEach(employee -> System.out.println(
                "EmployeeNumber: " + employee.getEmployeeNumber() + " | " + "EmployeeName: " + employee.getEmployeeName()
        ));

        System.out.println();

        // Ascending order Sorting based on Employee Name

        System.out.println("Ascending order Sorting based on Employee Name");

        employeeList.stream().sorted(Comparator.comparing(Employee::getEmployeeName)).forEach(System.out::println);

        System.out.println();

        // Descending order Sorting based on Employee Name

        System.out.println("Descending order Sorting based on Employee Name");

        employeeList.stream().sorted((employee1, employee2) -> employee2.getEmployeeName().compareTo(employee1.getEmployeeName())).forEach(System.out::println);


    }


}
