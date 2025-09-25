package Java8_2_Practice;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class TestJPMCBang {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(200, "Deepika"));
        employeeList.add(new Employee(400, "Sunny"));
        employeeList.add(new Employee(300, "Mallika"));
        employeeList.add(new Employee(100, "Katrina"));

        // Printing the arraylist object by iterating
        System.out.println("Printing the arraylist object by iterating...");

        employeeList.stream().forEach(employee -> System.out.println("EmployeeNumber: " + employee.getEmployeeNumber() + " | " + "EmployeeName: " + employee.getEmployeeName()));

        System.out.println();

        // Ascending order Sorting based on Employee Number
        System.out.println("Ascending order Sorting based on Employee Number...");

        employeeList.stream().sorted((e1,e2) -> e1.getEmployeeNumber() - e2.getEmployeeNumber()).forEach(employee -> System.out.println(
                "EmployeeNumber: " + employee.getEmployeeNumber() + " | " + "EmployeeName: " + employee.getEmployeeName()
                ));

        System.out.println();

        // Descending order Sorting based on Employee Number
        System.out.println("Descending order Sorting based on Employee Number...");

        employeeList.stream().sorted((e1,e2) -> e2.getEmployeeNumber() - e1.getEmployeeNumber()).forEach(employee -> System.out.println(
                "EmployeeNumber: " + employee.getEmployeeNumber() + " : " + "EmployeeName: " + employee.getEmployeeName()
        ));

        System.out.println();

        // Ascending order Sorting based on Employee Name
        System.out.println("Ascending order Sorting based on Employee Name...");
        System.out.println("Following traditional approach...(with iteration)");

        employeeList.stream().sorted((e1,e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName())).forEach(employee ->
                System.out.println(
                        "EmployeeNumber: " + employee.getEmployeeNumber() + " | " + "EmployeeName: " + employee.getEmployeeName()
                ));

        System.out.println();
        System.out.println("Following smart approach...(without iteration)");

        employeeList.sort(Comparator.comparing(Employee::getEmployeeName));
        System.out.println(employeeList);

        System.out.println();

        // Descending order Sorting based on Employee Name

        System.out.println("Descending order Sorting based on Employee Name...");
        System.out.println("Following traditional approach...(with iteration)");

        employeeList.stream().sorted((e1,e2) -> e2.getEmployeeName().compareTo(e1.getEmployeeName())).forEach(employee ->
                System.out.println(
                        "EmployeeNumber: " + employee.getEmployeeNumber() + " | " + "EmployeeName: " + employee.getEmployeeName()
                ));

        System.out.println();
        System.out.println("Following smart approach...(without iteration)");

        employeeList.sort(Comparator.comparing(Employee::getEmployeeName).reversed());
        System.out.println(employeeList);

        System.out.println();
    }
}
