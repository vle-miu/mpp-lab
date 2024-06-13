package lecture5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {

    public CustOrderFactory() {
    }

    public static Customer createCustomer(String name) {
        return new Customer(name);
    }

    public static Order createOrder(LocalDate date) {
        return new Order(date);
    }

}
