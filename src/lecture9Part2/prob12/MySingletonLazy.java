package lecture9Part2.prob12;

import java.util.Optional;

public class MySingletonLazy {

    private static MySingletonLazy instance = null;

    private MySingletonLazy() {}

    public static MySingletonLazy getInstance() {
        return Optional.ofNullable(instance).orElseGet(MySingletonLazy::createInstance);
    }

    private static MySingletonLazy createInstance() {
        instance = new MySingletonLazy();
        return instance;
    }
}
