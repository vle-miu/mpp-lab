package lecture9Part2.prob10b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStreamGenerator {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stringStream.collect(Collectors.joining(", ")));
    }
}
