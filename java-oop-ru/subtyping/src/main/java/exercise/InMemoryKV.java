package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV  implements KeyValueStorage {
    private final Map<String, String> map;

    InMemoryKV(Map<String, String> map) {
        this.map = new HashMap<>(map);
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> newMap = new HashMap<>(map);
        newMap.put(key, value);
        map = newMap;
    }

    @Override
    public void unset(String key) {
        ap<String, String> newMap = new HashMap<>(map);
        newMap.remove(key);
        map = newMap;
    }

    @Override
    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }
}
// END
