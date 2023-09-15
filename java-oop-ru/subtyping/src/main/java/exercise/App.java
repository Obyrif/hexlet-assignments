package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> existingData = storage.toMap();
        Map<String, String> swappedMap = new Hashap<>();

        for (Map.Entry<String, String> entry : existingData.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        for (Map.Entry<String, String> entry : swappedMap.entrySet()) {
            storage.set(entry.getKey(), entry.getValue());
        }
    }
}

// END
