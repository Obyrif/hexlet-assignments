package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

// BEGIN
public class App {
    public static String getForwardedVariables(String conf) {
        List<String> lines = Arrays.asList(conf.split("\n"));
        String result = lines.stream()
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.substring("environment=".length()))
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .filter(line -> line.startsWith("X_FORWARDED_"))
                .map(line -> line.substring("X_FORWARDED_".length() + 1))
                .collect(Collectors.joining(","));
        return result;
    }
}
//END
