package lecture5.prob1.rulesets;

import lecture5.prob1.gui.BookWindow;

import java.awt.*;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 */
public class BookRuleSet implements RuleSet {

    private static final float PRICE_MIN_VALUE = 0.49f;

    private BookWindow bookWindow;

    @Override
    public void applyRules(Component ob) throws RuleException {
        bookWindow = (BookWindow) ob;

        nonEmptyAllFieldRule();
        validateIsbn();
        validatePrice();
    }

    private void validatePrice() throws RuleException {
        try {
            // 2. Price must be a floating point number with two decimal places
            String priceValueStr = bookWindow.getPriceValue().trim();
            float priceValue = Float.parseFloat(priceValueStr);
            String[] splitter = priceValueStr.split("\\.");
            splitter[0].length();
            int decimalLength = splitter[1].length();

            if (decimalLength != 2) {
                throw new RuleException("Price must be a floating point number with two decimal places");
            }

            // 3. Price must be a number greater than 0.49.
            if (priceValue <= PRICE_MIN_VALUE) {
                throw new RuleException("Price must be greater than " + PRICE_MIN_VALUE);
            }
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be a floating point number with two decimal places");
        }
    }

    private void validateIsbn() throws RuleException {
        String isbn = bookWindow.getIsbnValue().trim();

        // 2. Isbn must be numeric and consist of either 10 or 13 characters
        try {
            Long.parseLong(isbn);
            if (isbn.length() != 10 && isbn.length() != 13) {
                throw new RuleException("Isbn must be consist of either 10 or 13 characters");
            }
        } catch (NumberFormatException e) {
            throw new RuleException("Isbn must be numeric");
        }

        // 3. If Isbn has length 10, the first digit must be 0 or 1
        if (isbn.length() == 10) {
            String firstDigit = isbn.substring(0, 1);
            if (!firstDigit.equals("0") && !firstDigit.equals("1")) {
                throw new RuleException("If Isbn has length 10, the first digit must be 0 or 1");
            }
        }

        // 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
        if (isbn.length() == 13) {
            String first3Digits = isbn.substring(0, 3);
            if (!first3Digits.equals("978") && !first3Digits.equals("979")) {
                throw new RuleException("If Isbn has length 13, the first 3 digits must be either 978 or 979");
            }
        }
    }

    private void nonEmptyAllFieldRule() throws RuleException {
        if (bookWindow.getIsbnValue().trim().isEmpty() ||
                bookWindow.getTitleValue().trim().isEmpty() ||
                bookWindow.getPriceValue().trim().isEmpty()) {
            throw new RuleException("All fields must be non-empty!");
        }
    }

}
