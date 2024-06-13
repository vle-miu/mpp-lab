package lecture5.prob1.rulesets;

import lecture5.prob1.gui.CDWindow;

import java.awt.*;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Price must be a floating point number with two decimal places
 * 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet implements RuleSet {

    private static final float PRICE_MIN_VALUE = 0.49f;

    private CDWindow cdWindow;

    @Override
    public void applyRules(Component ob) throws RuleException {
        cdWindow = (CDWindow) ob;

        nonEmptyAllFieldRule();
        validatePrice();
    }

    private void validatePrice() throws RuleException {
        try {
            // 2. Price must be a floating point number with two decimal places
            String priceValueStr = cdWindow.getPriceValue().trim();
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

    private void nonEmptyAllFieldRule() throws RuleException {
        if (cdWindow.getArtistValue().trim().isEmpty() ||
                cdWindow.getTitleValue().trim().isEmpty() ||
                cdWindow.getPriceValue().trim().isEmpty()) {
            throw new RuleException("All fields must be non-empty!");
        }
    }

}
