package lecture2.prob2B;

public class OrderLine {

    private String orderLineName;

    private Order order;

    public OrderLine(String orderLineName, Order order) {
        this.orderLineName = orderLineName;
        this.order = order;
    }

    public String getOrderLineName() {
        return orderLineName;
    }

    public Order getOrder() {
        return order;
    }

}
