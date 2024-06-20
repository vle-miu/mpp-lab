package finalReview.practices.helperClass.prob1a;

import finalReview.practices.helperClass.CheckoutRecord;
import finalReview.practices.helperClass.CheckoutRecordEntry;
import finalReview.practices.helperClass.TestData;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Prob1a {

    public static void main(String[] args) {
        TestData testData = TestData.INSTANCE;
        System.out.println(query1AStreamPipeline(testData.getAllRecords()));
        System.out.println(query1ALambdaLibraryElement(testData.getAllRecords()));
        System.out.println(query1AInnerClass(testData.getAllRecords()));
    }

    // Stream pipeline
    public static List<CheckoutRecord> query1AStreamPipeline(List<CheckoutRecord> checkoutRecords) {
        return checkoutRecords.stream()
                .filter(e -> e.getCheckoutRecordEntries().stream()
                        .anyMatch(c -> !c.getCopy().isAvailable() && c.getDueDate().isBefore(LocalDate.now())))
                .collect(Collectors.toList());
    }

    // Lambda library element
    public static List<CheckoutRecord> query1ALambdaLibraryElement(List<CheckoutRecord> checkoutRecords) {
        Predicate<CheckoutRecordEntry> isOverdue = e -> !e.getCopy().isAvailable() && e.getDueDate().isBefore(LocalDate.now());
        Predicate<CheckoutRecord> isExist = e -> e.getCheckoutRecordEntries().stream().anyMatch(isOverdue);

        return checkoutRecords.stream()
                .filter(isExist)
                .collect(Collectors.toList());
    }

    // Local inner class
    public static List<CheckoutRecord> query1AInnerClass(List<CheckoutRecord> checkoutRecords) {
        return checkoutRecords.stream()
                .filter(new IsExist())
                .collect(Collectors.toList());
    }

    static class IsOverdue implements Predicate<CheckoutRecordEntry> {
        @Override
        public boolean test(CheckoutRecordEntry checkoutRecordEntry) {
            return !checkoutRecordEntry.getCopy().isAvailable() && checkoutRecordEntry.getDueDate().isBefore(LocalDate.now());
        }
    }

    static class IsExist implements Predicate<CheckoutRecord> {
        @Override
        public boolean test(CheckoutRecord checkoutRecord) {
            return checkoutRecord.getCheckoutRecordEntries().stream().anyMatch(new IsOverdue());
        }
    }
}
