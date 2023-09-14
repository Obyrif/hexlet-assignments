package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> list, int num){
        return list.stream()
                .limit(num)
                .sorted(Home::compareTo)
                .map(Home -> Home.toString())
                .collect(Collectors.toList());
    }
}
// END
