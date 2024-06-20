package finalReview.part3_2;

import java.io.Serializable;

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

}