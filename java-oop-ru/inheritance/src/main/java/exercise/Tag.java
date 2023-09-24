package exercise;

import java.util.Map;

// BEGIN
public class Tag {
    public String name;
    public Map<String, String> attribute;

    public Tag(String name, Map<String, String> attribute) {
        this.name = name;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getAttribute() {
        return attribute;
    }
}
// END
