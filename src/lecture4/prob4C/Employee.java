package lecture4.prob4C;

public abstract class Employee {

    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public PayCheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);

        double fica = grossPay * 23 / 100;
        double state = grossPay * 5 / 100;
        double local = grossPay * 1 / 100;
        double medicare = grossPay * 3 / 100;
        double socialSecurity = grossPay * 7.5 / 100;

        return new PayCheck(grossPay, fica, state, local, medicare, socialSecurity);
    }

    protected abstract double calcGrossPay(int month, int year);
}
