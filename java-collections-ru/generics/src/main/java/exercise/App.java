package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {
    public static <K, V> List<Map<K, V>> findWhere(List<Map<K, V>> books, Map<K, V> criteria) {
        List<Map<K, V>> result = new ArrayList<>();
        for (Map<K, V> book : books) {
            if (book.entrySet().containsAll(criteria.entrySet())) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
