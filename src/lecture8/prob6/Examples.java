package lecture8.prob6;

import java.util.Comparator;
import java.util.function.*;

public class Examples {

    private static void evaluator() {
        // A. (Employee e) -> e.getName()
        Function<Employee, String> getName = (Employee e) -> e.getName();
        // Class::instanceMethod
        Function<Employee, String> getNameRefMethod = Employee::getName;

        // B. (Employee e, String s) -> e.setName(s)
        BiConsumer<Employee, String> setName = (Employee e, String s) -> {
            e.setName(s);
        };
        // Class::instanceMethod
        BiConsumer<Employee, String> setNameRefMethod = Employee::setName;


        // C. (String s1, String s2) -> s1.compareTo(s2)
        BiFunction<String, String, Integer> compareStrings = (String s1, String s2) -> s1.compareTo(s2);
        // Class::instanceMethod
        BiFunction<String, String, Integer> compareStringsRefMethod = String::compareTo;

        // D. (Integer x,Integer y) -> Math.pow(x,y)
        BiFunction<Integer, Integer, Double> pow = (Integer x, Integer y) -> Math.pow(x, y);
        // Class::staticMethod
        BiFunction<Integer, Integer, Double> powRefMethod = Math::pow;

        // E. (Apple a) -> a.getWeight()
        Function<Apple, Integer> getWeight = (Apple a) -> a.getWeight();
        // Class::instanceMethod
        Function<Apple, Integer> getWeightRefMethod = Apple::getWeight;

        // F. (String x) -> Integer.parseInt(x)
        ToIntFunction<String> parseInt = (String x) -> Integer.parseInt(x);
        // Class::staticMethod
        ToIntFunction<String> parseIntRefMethod = Integer::parseInt;

        // G. EmployeeNameComparator comp = new EmployeeNameComparator();
        // (Employee e1, Employee e2) -> comp.compare(e1,e2)
        Comparator<Employee> comp = new EmployeeNameComparator();
        BiFunction<Employee, Employee, Integer> compareEmployees = (Employee e1, Employee e2) -> comp.compare(e1, e2);
        // Object::instanceMethod
        BiFunction<Employee, Employee, Integer> compareEmployeesRefMethod = comp::compare;


        // Test the method references
        Employee employee = new Employee("John Doe", 123);
        Apple apple = new Apple(150);

        System.out.println(getNameRefMethod.apply(employee));
        System.out.println(compareStringsRefMethod.apply("abc", "abc"));
        System.out.println(powRefMethod.apply(2, 3));
        System.out.println(getWeightRefMethod.apply(apple));
        System.out.println(parseIntRefMethod.applyAsInt("42"));
        Employee employee2 = new Employee("John Doe", 456);
        System.out.println(compareEmployeesRefMethod.apply(employee, employee2));

        setNameRefMethod.accept(employee, "Jane Doe");
    }

    public static void main(String [] args) {
        evaluator();
    }
}
