package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> email) {
        return email.stream()
                .filter(name -> name.startsWith("gmail") || name.startsWith("yandex") || name.startsWith("hotmail"))
                .count();
    }
}