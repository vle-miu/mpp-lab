package lecture4.prob4C;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

    private double commission;

    private double baseSalary;

    private List<Order> orders = new ArrayList<>();

    public Commissioned(String employeeId, double commission, double baseSalary) {
        super(employeeId);
        this.commission = commission;
        this.baseSalary = baseSalary;
    }

    public void addNewOrder(Integer orderId, LocalDate orderDate, int orderAmount) {
        Order newOrder = new Order(orderId, orderDate, orderAmount);
        orders.add(newOrder);
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        double orderAmount = 0.0;
        for (Order order : orders) {
            orderAmount += order.getOrderAmount();
        }

        return orderAmount * commission + baseSalary;
    }
}
