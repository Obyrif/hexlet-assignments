package exercise;

import java.util.Arrays;
import java.util.List;


// BEGIN
public class App {
    private static final List<String> FREE_DOMENTS = Arrays.asList("gmail.com" , "yandex.ru " , "hotmail.com");

    public static int getCountOfFreeEmails(List<String> email) {
        return (int) emails.stream()
                .map(email -> email.split("@") [1])
                .filter(email -> FREE_DOMENTS.contains(email))
                .count();
    }
}
