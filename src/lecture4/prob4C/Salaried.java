package lecture4.prob4C;

public class Salaried extends Employee {

    private double salary;

    public Salaried(String employeeId) {
        super(employeeId);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        return getSalary();
    }
}
