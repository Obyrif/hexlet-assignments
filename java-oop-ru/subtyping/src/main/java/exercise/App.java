package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> existingData = new HashMap<>();
        TreeMap<String, String> s = new TreeMap<>(existingData);
        for (Map.Entry<String, String> entry : existingData.entrySet()) {
            existingData.put(entry.getValue(), entry.getKey());
        }
    }
}

// END
