package lecture2.prob2B;

import java.util.HashSet;
import java.util.Set;

public class Order {

    private Integer orderNum;

    private Set<OrderLine> orderLines;

    public Order(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public void addOrderLine(String orderLineName) {
        if (this.orderLines == null || this.orderLines.isEmpty()) {
            this.orderLines = new HashSet<>();
        }

        OrderLine newOrderLine = new OrderLine(orderLineName, this);
        this.orderLines.add(newOrderLine);
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

}
