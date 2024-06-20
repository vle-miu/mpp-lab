package finalReview.part3_3;

import lecture9.prob1.business.LibrarySystemException;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

    }

    public LibraryMember detectIfWinnerDuringCheckout(
            List<LibraryMember> mems, Iterator<Book> specialBooks) {
        return mems.stream()
                .filter(mem -> {
                    try {
                        CheckoutRecord checkoutRecord = mem.checkout(specialBooks.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2021, 10, 28));
                        return checkoutRecord.getCheckoutRecordEntryList().size() == 10;
                    } catch (LibrarySystemException e) {
                        throw new RuntimeException(e);
                    }
                })
                .findFirst().orElse(null);
    }
}
