package finalReview.part4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("def");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ghi");
        list2.add("jkl");

        Stream<ArrayList<String>> stream = Stream.of(list1, list2);
        System.out.println(combine(stream));
    }

    public static ArrayList<String> combine(Stream<ArrayList<String>> stream) {
        return stream.reduce(new ArrayList<>(), Main::combine);
    }

    private static ArrayList<String> combine(ArrayList<String> a, ArrayList<String> b) {
        a.addAll(b);
        return a;
    }
}
