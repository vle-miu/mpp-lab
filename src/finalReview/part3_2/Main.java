package finalReview.part3_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("1001", "Def", 3);
        Book book2 = new Book("1002", "Abcd", 3);
        Book book3 = new Book("1003", "Debcf", 3);

        BookCopy bookCopy = new BookCopy(book, 2);
        BookCopy bookCopy1 = new BookCopy(book2, 3);
        BookCopy bookCopy2 = new BookCopy(book3, 2);

        CheckoutRecordEntry checkoutRecordEntry = new CheckoutRecordEntry(LocalDate.of(2015, 6, 27), LocalDate.of(2015, 7, 1), bookCopy);
        CheckoutRecordEntry checkoutRecordEntry1 = new CheckoutRecordEntry(LocalDate.of(2015, 6, 27), LocalDate.of(2015, 7, 1), bookCopy1);
        CheckoutRecordEntry checkoutRecordEntry2 = new CheckoutRecordEntry(LocalDate.of(2015, 6, 27), LocalDate.of(2015, 7, 1), bookCopy2);
        CheckoutRecordEntry checkoutRecordEntry3 = new CheckoutRecordEntry(LocalDate.of(2015, 6, 28), LocalDate.of(2015, 7, 1), bookCopy2);

        CheckoutRecord checkoutRecord = new CheckoutRecord();
        checkoutRecord.addEntry(checkoutRecordEntry);
        checkoutRecord.addEntry(checkoutRecordEntry1);

        CheckoutRecord checkoutRecord1 = new CheckoutRecord();
        checkoutRecord1.addEntry(checkoutRecordEntry2);
        checkoutRecord1.addEntry(checkoutRecordEntry3);

        List<CheckoutRecord> list = new ArrayList<CheckoutRecord>();
        list.add(checkoutRecord);
        list.add(checkoutRecord1);

        System.out.println(list.stream()
                .flatMap(e -> e.getCheckoutRecordEntryList().stream())
                .filter(c -> c.getCheckOutDate().equals(LocalDate.of(2015, 6, 27)))
                .map(c -> c.getBookCopy().getBook().getTitle())
                .sorted(Comparator.comparing(String::length).thenComparing((String t) -> t))
                .collect(Collectors.toList()));
    }
}
