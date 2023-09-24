package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
public class PairedTag extends Tag {
    private String string;
    public List<Tag> list;

    public PairedTag(String name, Map<String, String> attribute, String string, List<Tag> list) {
        super(name, attribute);
        this.string = string;
        this.list = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getName());

        for (Map.Entry<String, String> entry : getAttribute().entrySet()) {
            sb.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\" ");
        }
        if(!string.isEmpty()) {
            sb.append(string);
        }
        for (Tag child : list) {
            sb.append(child.toString());
        }
        sb.append("</").append(getName()).append(">");
        return sb.toString();
    }
}
// END
