package exercise;

import java.util.Map;

public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> result = storage.toMap();
        result.entrySet().stream()
                .forEach(x -> {
                    var r = x.getKey();
                    var e = x.getValue();
                    storage.unset(r);
                    storage.set(e, r);
                });
    }
}
// END
