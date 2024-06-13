package lecture8.excercise9_1;

import java.util.stream.Stream;

public class StreamExcercise {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 2).skip(4).limit(4);
        stream.forEach(System.out::println);
    }
}
