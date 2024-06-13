package lecture2.prob2B;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(1);

        order.addOrderLine("Orderline 1");
        order.addOrderLine("Orderline 2");
        System.out.println(order);
    }
}
