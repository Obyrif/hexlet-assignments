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
        Map<String, String> newMap = new HashMap<>(this.map);
        newMap.put(key, value);
        this.map = newMap;
    }

    @Override
    public void unset(String key) {
        Map<String, String> newMap = new HashMap<>(this.map);
        newMap.remove(key);
        this.map = newMap;
    }

    @Override
    public String get(String key, String defaultValue) {
        return this.map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.map);
    }
}
// END
