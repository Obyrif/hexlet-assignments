package exercise;

import java.util.Arrays;
import java.util.List;


// BEGIN
public class App {
    private static final List<String> FREE_DOMENTS = Arrays.asList("gmail.com" , "yandex.ru " , "hotmail.com");

    public static int getCountOfFreeEmails(List<String> email) {
        return (int) email.stream()
                .map(emails -> emails.split("@") [1])
                .filter(emails -> FREE_DOMENTS.contains(emails))
                .count();
    }
}
