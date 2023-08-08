package exercise;

import java.util.Arrays;
import java.util.List;


// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> email) {
        return (int) email.stream()
                .filter(adress -> isFreeDomain(adress))
                .count();
    }
    public static boolean isFreeDomain(Strind adress) {
        String[] split = adress.split("@");
        if(split.length > 1) {
            String domain = split[1];
            return domain.equals("gmail.com") || domain.equals("yandex.ru") || domain.equals("hotmail.com");
        }
        return false;
    }
}
