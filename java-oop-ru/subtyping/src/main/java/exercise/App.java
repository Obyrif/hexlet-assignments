package exercise;

import java.util.Map;
import java.util.TreeMap;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> existingData = storage.toMap();
        TreeMap<String, String> s2 = new TreeMap<>(existingData);
        for (Map.Entry<String, String> entry : s2.entrySet()) {
            existingData.put(entry.getValue(), entry.getKey());
        }
    }
}
// END
