package exercise;

// BEGIN
public class LabelTag implements TagInterface{
    private String value;
    private TagInterface tagInterface;

    public LabelTag(String value, TagInterface tagInterface) {
        this.value = value;
        this.tagInterface = tagInterface;
    }

    @Override
    public String render() {
        String tag = tagInterface.render();
        return String.format("<label>%s%s</label>", value, tag);
    }
}
// END
