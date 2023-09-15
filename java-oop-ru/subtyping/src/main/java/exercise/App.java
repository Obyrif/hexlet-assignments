package exercise;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> data = new HashMap<>(storage.toMap());

        for (Map.Entry<String, String> entry : data.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            storage.unset(key);
            storage.set(value, key);
        }
    }
}
// END
