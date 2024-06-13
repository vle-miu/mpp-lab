package lecture8.prob1b;

import java.util.function.Supplier;

public class RandomNumberGeneratorWithInnerClass {

    public static void main (String [] args) {
        RandomSupplier supplier = new RandomSupplier();
        System.out.println(supplier.get());
    }

    static class RandomSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
