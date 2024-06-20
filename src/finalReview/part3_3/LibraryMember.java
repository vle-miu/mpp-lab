package finalReview.part3_3;

import lecture9.prob1.business.LibrarySystemException;

import java.io.Serializable;
import java.time.LocalDate;

final public class LibraryMember implements Serializable {

    private static final long serialVersionUID = -2226197306790714013L;

    private String memberId;

    private CheckoutRecord checkoutRecord;

    public LibraryMember(String memberId, String fname, String lname, String tel, Address add) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }

    public CheckoutRecord checkout(BookCopy copy, LocalDate checkoutDate, LocalDate dueDate) throws LibrarySystemException {
        CheckoutRecord record = new CheckoutRecord();
        return record;
    }

}