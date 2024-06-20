package finalReview.part3_1;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MyClass {

    BiFunction<Double, Double, Boolean> lambda = (x, y) -> x * y < x + y;

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        System.out.println(myClass.evaluate());

        class BiFunctionImpl implements BiFunction<Double, Double, Boolean> {

            @Override
            public Boolean apply(Double a, Double b) {
                return a * b < a + b;
            }

        }

        Supplier<Double> supplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return 0.0;
            }
        };
    }

    public boolean evaluate() {
        return lambda.apply(2.1, 0.35);
    }
}
