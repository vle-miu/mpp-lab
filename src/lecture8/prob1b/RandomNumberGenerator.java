package lecture8.prob1b;

import java.util.function.Supplier;

public class RandomNumberGenerator {

    public static void main (String [] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());
    }
}
