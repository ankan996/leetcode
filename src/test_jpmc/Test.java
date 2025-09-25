package test_jpmc;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

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

        // Group by department name, sort by salary desc, and pick top 3 per department
        Map<String, List<Employee>> top3PerDept = employees.stream()
                .collect(Collectors.groupingBy(
                        // 1st clause
                        employee -> employee.getDepartment().getDeptName(),
                        // 2nd clause
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                        .limit(3)
                                        .collect(Collectors.toList())
                        )
                ));

        System.out.println(top3PerDept);

        // Print results
        top3PerDept.forEach((department, employee) -> {
            System.out.println("Department: " + department);
            employee.forEach(System.out::println);
            System.out.println();
        });
    }
}
