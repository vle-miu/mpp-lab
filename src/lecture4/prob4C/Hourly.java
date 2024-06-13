package lecture4.prob4C;

public class Hourly extends Employee {

    private double hourlyWage;

    private double hoursPerWeek;

    public Hourly(String employeeId) {
        super(employeeId);
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }
}
