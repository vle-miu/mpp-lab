package finalReview.part2_2;

import java.util.Optional;

public class MySingletonThreadSafe {

    private static MySingletonThreadSafe instance;

    private MySingletonThreadSafe() {}

    public static MySingletonThreadSafe getInstance() {
        return Optional.ofNullable(instance).orElseGet(MySingletonThreadSafe::new);
    }
}
