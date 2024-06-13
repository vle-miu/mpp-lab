package quiz1;

public class Customer {

    private String name;

    private Account account;

    public Customer(String name, String accountId) {
        this.name = name;
        account = new Account(accountId, this);
    }

    public Account getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }
}
