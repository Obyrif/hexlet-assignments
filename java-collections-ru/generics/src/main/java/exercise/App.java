package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(ArrayList<Map<String, String >> books, HashMap<String, String> line) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book: books) {
            if(book.entrySet().containsAll(line.entrySet())) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
