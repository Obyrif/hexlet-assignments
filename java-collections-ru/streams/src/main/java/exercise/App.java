package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<Srtring> email) {
        return email.stream()
                .filter(name -> StringUtils.isNotBlank(name))
                .filter(name -> name.startWith("gmail", "yandex", "hotmail"))
                .count();
    }
}