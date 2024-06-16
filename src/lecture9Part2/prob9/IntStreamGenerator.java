package lecture9Part2.prob9;

import java.util.stream.IntStream;

public class IntStreamGenerator {

    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num) {
        IntStream.iterate(1, i -> i + 1)
                .limit(num)
                .forEach(i -> System.out.println(i * i));
    }
}
