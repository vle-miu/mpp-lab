package finalReview.practices.helperClass.prob1b;

import finalReview.practices.helperClass.*;

import java.util.List;
import java.util.function.Predicate;

public class Prob1b {

    public static void main(String[] args) {
        TestData testData = TestData.INSTANCE;
        System.out.println(query1BStreamPipeline(testData.getAllBooks().get(0).getCopies().get(0), testData.getMembers().get(0)));
        System.out.println(query1BLambdaLibraryElement(testData.getAllBooks().get(0).getCopies().get(0), testData.getMembers().get(0)));
        System.out.println(query1BInnerClass(testData.getAllBooks().get(0).getCopies().get(0), testData.getMembers().get(0)));
    }

    // Stream pipleline
    private static boolean query1BStreamPipeline(BookCopy copy, LibraryMember mem) {
        return mem.getRecord()
                .getCheckoutRecordEntries().stream()
                .anyMatch(e -> e.getCopy().getCopyNumber() == copy.getCopyNumber());
    }

    // Lambda library element
    private static boolean query1BLambdaLibraryElement(BookCopy copy, LibraryMember mem) {
        Predicate<CheckoutRecordEntry> IsAnyMatch = e -> e.getCopy().getCopyNumber() == copy.getCopyNumber();
        return mem.getRecord().getCheckoutRecordEntries().stream().anyMatch(IsAnyMatch);
    }

    // Inner class
    private static boolean query1BInnerClass(BookCopy copy, LibraryMember mem) {
        return mem.getRecord().getCheckoutRecordEntries().stream().anyMatch(new IsAnyMatch(copy));
    }

    static class IsAnyMatch implements Predicate<CheckoutRecordEntry> {
        private BookCopy copy;

        public IsAnyMatch(BookCopy copy) {
            this.copy = copy;
        }

        @Override
        public boolean test(CheckoutRecordEntry entry) {
            return entry.getCopy().getCopyNumber() == this.copy.getCopyNumber();
        }
    }
}
