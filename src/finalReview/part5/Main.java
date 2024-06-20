package finalReview.part5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> listString = Arrays.asList("def", "abc", "jkh");
        List<Integer> listInteger = Arrays.asList(4, 2, 5, 7);
        List<LocalDate> listLocalDate = Arrays.asList(LocalDate.of(2024, 3, 4), LocalDate.of(2024, 3, 2), LocalDate.of(2024, 3, 3));
        System.out.println(minGeneric(listString));
        System.out.println(minGeneric(listInteger));
        System.out.println(minGeneric(listLocalDate));

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);

    }

    public static <T extends Comparable<? super T>> T minGeneric(List<T> list) {
        T min = list.get(0);
        for (T t : list) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }

    public static Integer min(List<Integer> list) {
        Integer min = list.get(0);
        for (Integer i : list) {
            if (i.compareTo(min) > 0) {
                min = i;
            }
        }
        return min;
    }
}
