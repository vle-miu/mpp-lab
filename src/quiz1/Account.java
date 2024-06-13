package quiz1;

public class Account {

    private String accountId;

    private Customer customer;

    public Account(String accountId, Customer customer) {
        this.accountId = accountId;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
