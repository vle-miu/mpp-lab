package quiz3;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibary {

    public static final BiFunction<List<Customer>, String, List<String>> CUSTOMER_NAME_FILER = (list, city)
            -> list.stream()
                .filter(e -> e.getCity().equals(city))
                .map(Customer::getName)
                .collect(Collectors.toList());
}
