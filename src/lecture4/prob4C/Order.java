package lecture4.prob4C;

import java.time.LocalDate;

public class Order {

    private int orderID;

    private LocalDate orderDate;

    private int orderAmount;

    public Order(int orderID, LocalDate orderDate, int orderAmount) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }
}
