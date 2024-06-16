package lecture9Part2.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MyIntStreamGenerator {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IntSummaryStatistics statistics = stream.summaryStatistics();

        System.out.println("Max: " + statistics.getMax());
        System.out.println("Min: " + statistics.getMin());
    }
}
