package lecture5.prob4.extpackage;

import lecture5.prob4.CustOrderFactory;
import lecture5.prob4.Customer;
import lecture5.prob4.Order;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer customer = CustOrderFactory.createCustomer("Bob");
        Order order = CustOrderFactory.createOrder(LocalDate.now());
        order.addItem("Shirt");
        order.addItem("Laptop");
        customer.addOrder(order);

        Order order1 = CustOrderFactory.createOrder(LocalDate.now());
        order1.addItem("Pants");
        order1.addItem("Knife set");
        customer.addOrder(order1);

        System.out.println(customer.getOrders());
    }
}

		
