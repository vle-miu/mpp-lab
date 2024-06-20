package finalReview.practices.helperClass.prob1c;

import finalReview.practices.helperClass.BookCopy;
import finalReview.practices.helperClass.CheckoutRecordEntry;
import finalReview.practices.helperClass.LibraryMember;
import finalReview.practices.helperClass.TestData;
import finalReview.practices.helperClass.prob1b.Prob1b;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Prob1c {

    public static void main(String[] args) {
        TestData testData = TestData.INSTANCE;
        System.out.println(query1CStreamPipeline(testData.getMembers()));
        System.out.println(query1CLambdaLibraryElement(testData.getMembers()));
        System.out.println(query1CInnerClass(testData.getMembers()));
    }

    // Stream pipleline
    private static List<String> query1CStreamPipeline(List<LibraryMember> members) {
        return members.stream()
                .filter(e -> e.getRecord().getCheckoutRecordEntries().isEmpty())
                .sorted(Comparator.comparing(LibraryMember::getFirstName).reversed())
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .collect(Collectors.toList());
    }

    // Lambda library element
    private static List<String> query1CLambdaLibraryElement(List<LibraryMember> members) {
        Predicate<LibraryMember> filter = e -> e.getRecord().getCheckoutRecordEntries().isEmpty();
        Comparator<LibraryMember> comparator = Comparator.comparing(LibraryMember::getFirstName).reversed();
        Function<LibraryMember, String> map = e -> e.getFirstName() + " " + e.getLastName();

        return members.stream()
                .filter(filter)
                .sorted(comparator)
                .map(map)
                .collect(Collectors.toList());
    }

    // Inner class
    private static List<String> query1CInnerClass(List<LibraryMember> members) {
        return members.stream()
                .filter(new FilterClass())
                .sorted(new ComparatorClass())
                .map(new MapClass())
                .collect(Collectors.toList());
    }

    static class FilterClass implements Predicate<LibraryMember> {
        @Override
        public boolean test(LibraryMember member) {
            return member.getRecord().getCheckoutRecordEntries().isEmpty();
        }
    }

    static class ComparatorClass implements Comparator<LibraryMember> {
        @Override
        public int compare(LibraryMember o1, LibraryMember o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

    static class MapClass implements Function<LibraryMember, String> {
        @Override
        public String apply(LibraryMember libraryMember) {
            return libraryMember.getFirstName() + " " + libraryMember.getLastName();
        }
    }

}
