package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attribute) {
        super(name, attribute);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getName());

        for (Map.Entry<String, String> entry : getAttribute().entrySet()) {
            sb.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }
        sb.append(">");
        return sb.toString();
    }
}
// END
