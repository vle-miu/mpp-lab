package quiz2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("employee1", 5000);
        Employee employee2 = new Employee("employee2", 6000);
        Employee employee3 = new Employee("employee1", 5000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Set<Employee> employeeSet = new HashSet<>();
        for (Employee e : employeeList) {
            employeeSet.add(e);
        }

        for (Employee e : employeeSet) {
            System.out.println(e);
        }

    }
}
