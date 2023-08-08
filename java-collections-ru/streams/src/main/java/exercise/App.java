package exercise;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> email) {
        List<String> emails = email;
        List<String> filterEmail = emails.stream()
                .filter(name -> name.startsWith("gmail") || name.startsWith("yandex") || name.startsWith("hotmail"))
                .collect(Collectors.toList());
        int result = filterEmail.size();
        return result;
    }
}