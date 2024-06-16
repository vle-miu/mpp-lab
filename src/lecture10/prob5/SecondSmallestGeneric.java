package lecture10.prob5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestGeneric {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Nhat", "Thinh", "Duy", "Hana");
        System.out.println(secondSmallest(stringList));

        List<Integer> intList = Arrays.asList(1, 4, 5, 7, 2, 8);
        System.out.println(secondSmallest(intList));
    }

    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            return null;
        }

        T smallest = list.get(0);
        T secondSmallest = list.get(1);

        if (smallest.compareTo(secondSmallest) > 0) {
            T temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }

        for (int i = 2; i < list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = current;
            } else if (current.compareTo(secondSmallest) < 0){
                secondSmallest = current;
            }
        }
        return secondSmallest;
    }
}
