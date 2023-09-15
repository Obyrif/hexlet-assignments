package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> existingData = new HashMap<>();
        for (Map.Entry<String, String> entry : existingData.entrySet()) {
            existingData.put(entry.getValue(), entry.getKey());
        }
    }
}
// END
