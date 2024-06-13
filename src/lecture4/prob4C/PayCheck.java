package lecture4.prob4C;

public class PayCheck {

    private double grossPay;

    private double fica;

    private double state;

    private double local;

    private double medicare;

    private double socialSecurity;

    public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public double getNetPay() {
        return this.grossPay - (fica + state + local + medicare + socialSecurity);
    }

}
