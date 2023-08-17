package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, ?> data1, Map<String, ?> data2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for(String key1: data1.keySet()) {
            if(data2.containsKey(key1)) {
                Object value1 = data1.get(key1);
                Object value2 = data2.get(key1);

                if(value1.equals(value2)) {
                    result.put(key1, "unchanged");
                } else {
                    result.put(key1, "changed");
                }
            } else {
                result.put(key1, "deleted");
            }
        }
        for(String key2: data2.keySet()) {
            if(!data1.containsKey(key2)) {
                result.put(key2, "added");
            }
        }
        return result;
    }
}
//END
