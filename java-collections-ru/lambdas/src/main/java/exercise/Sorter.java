package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Comparator<Map<String, String>> comparator = Comparator.comparing(user ->
                LocalDate.parse(user.get("birthday"), formatter));
        return users.stream()
                .filter(man -> man.get("gender").equals("male"))
                .sorted(comparator)
                .map(man -> man.get("name"))
                .collect(Collectors.toList());
    }
}
// END
