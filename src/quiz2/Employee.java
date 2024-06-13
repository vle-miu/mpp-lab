package quiz2;

import java.util.Objects;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object employee) {
        if (employee == null) return false;
        if (!(employee instanceof Employee)) return false;
        Employee e = (Employee) employee;
        return this.name.equals(e.name) && this.salary == e.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "name =  " + this.name +  ", salary = " + this.salary;
    }

}
