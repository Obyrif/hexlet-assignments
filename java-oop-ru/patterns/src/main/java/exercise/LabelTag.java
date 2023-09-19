package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String value;
    private TagInterface tagInterface;

    public LabelTag(String value, TagInterface tagInterface) {
        this.value = value;
        this.tagInterface = tagInterface;
    }

    @Override
    public String render() {
        return String.format("<label value=\"%s\"\\%s\"", value, tagInterface);
    }
}
// END
