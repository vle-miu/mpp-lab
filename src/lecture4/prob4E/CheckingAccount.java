package lecture4.prob4E;

public class CheckingAccount extends Account {

    private double balance;

    private double monthlyFee;

    private String acctId;

    public CheckingAccount(String acctId, double monthlyFee, double balance) {
        this.acctId = acctId;
        this.balance = balance;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public String getAccountId() {
        return this.acctId;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return this.balance - this.monthlyFee;
    }
}
