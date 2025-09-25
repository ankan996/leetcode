package test_jpmc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, 3000, new Department(1, "HR")));
        employees.add(new Employee(2, 4500, new Department(1, "HR")));
        employees.add(new Employee(3, 6000, new Department(1, "HR")));
        employees.add(new Employee(4, 6500, new Department(1, "HR")));

        employees.add(new Employee(5, 7000, new Department(2, "Tech")));
        employees.add(new Employee(6, 9500, new Department(2, "Tech")));
        employees.add(new Employee(7, 12000, new Department(2, "Tech")));
        employees.add(new Employee(8, 12500, new Department(2, "Tech")));

        employees.add(new Employee(9, 5000, new Department(3, "Developer")));
        employees.add(new Employee(10, 8500, new Department(3, "Developer")));
        employees.add(new Employee(11, 11000, new Department(3, "Developer")));
        employees.add(new Employee(12, 11500, new Department(3, "Developer")));

        Map<String, List<Employee>> top3PerDepartment = employees.stream().collect(
                Collectors.groupingBy(
                        // 1st clause: Get the department names as key
                        employee -> employee.getDepartment().getDeptName(),

                        // 2nd clause: Get top 3 employees based on salary
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream().sorted(
                                        Comparator.comparing(Employee::getSalary).reversed()
                                ).limit(3).toList()
                        )
                )
        );

        top3PerDepartment.forEach((department, employee) ->{
                    System.out.println("Department: " + department);
                    employee.forEach(System.out::println);
                    System.out.println();
                }

                );

    }
}
