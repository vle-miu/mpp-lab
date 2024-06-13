package lecture4.prob4C;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Commissioned e = new Commissioned("100",.1,1000);
        e.addNewOrder(1, LocalDate.of(2021, 9, 1), 100);
        PayCheck p = e.calcCompensation(10, 2021);
        System.out.println(p.getNetPay());
    }
}
