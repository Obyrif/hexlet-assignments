package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String suggestion) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] splitWord = suggestion.split(" ");

        for (String s: splitWord) {
            if (wordCount.containsKey(s)) {
                int count = wordCount.get(s);
                count++;
                wordCount.put(s, count);
            } else {
                wordCount.put(s, 1);
            }
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        if (wordCount.isEmpty()) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder();

        sb.append("{\n");
        for (Map.Entry<String, Integer> entry: wordCount.entrySet()) {
            sb.append("  ")
                    .append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append('\n');
        }
        sb.append("}");
        return sb.toString();
    }
}
//END
