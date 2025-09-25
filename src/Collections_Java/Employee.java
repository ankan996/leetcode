package Collections_Java;

public class Employee implements Comparable {
    // private fields
    public String employeeName;
    public int employeeId;

    // constructor

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public String toString() {
        return employeeName + " -- " + employeeId;
    }

    @Override
    public int compareTo(Object obj) {

        int employeeId1 = this.employeeId;
        // cast obj to type: Employee
        Employee rootEmployee = (Employee) obj;
        int employeeId2 = rootEmployee.employeeId;

        if (employeeId1 < employeeId2) {
            return -1;
        } else if (employeeId1 > employeeId2) {
            return +1;
        } else
        return 0;
    }
}
