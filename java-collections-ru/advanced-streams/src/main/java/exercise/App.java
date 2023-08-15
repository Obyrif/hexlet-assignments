package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static String getForwardedVariables(String conf) {
        Map<String, String> variableMap = Arrays.stream(conf.split("\n"))
                .filter(line -> line.contains("environment"))
                .map(line -> line.split("=", 2))
                .map(parts -> parts[1].replaceAll("\"", ""))
                .flatMap(variables -> Arrays.stream(variables.split(",")))
                .map(variable -> variable.split("=", 2))
                .filter(keyValue -> keyValue[0].startsWith("X_FORWARDED_"))
                .collect(HashMap::new,
                        (map, keyValue) -> map.put(keyValue[0].substring("X_FORWARDED_".length()), keyValue[1]),
                        HashMap::putAll);

        return variableMap.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining(","));
    }
}
//END
