package lecture5.prob1.rulesets;

import lecture5.prob1.gui.BookWindow;
import lecture5.prob1.gui.CDWindow;

import java.awt.*;
import java.util.HashMap;

final public class RuleSetFactory {
    static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

    static {
        map.put(BookWindow.class, new BookRuleSet());
        map.put(CDWindow.class, new CDRuleSet());
    }

    private RuleSetFactory() {
    }

    public static RuleSet getRuleSet(Component component) {
        Class<? extends Component> clazz = component.getClass();

        if (!map.containsKey(clazz)) {
            throw new IllegalArgumentException("Not RuleSet found for this component");
        }

        return map.get(clazz);
    }
}
	