package lecture9Part2.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibary {

    public static final TriFunction<List<Employee>, Integer, Character, String> FULLNAME_IN_EMPLOYEE = (list, salary, startChar)
            -> list.stream()
                .filter(e -> e.getSalary() > salary && e.getLastName().charAt(0) >= startChar)
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .sorted()
                .collect(Collectors.joining(", "));
}
