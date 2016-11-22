public class XmlDocument implements Document {

    private String name;
    private String contents;

    public XmlDocument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public void print() {
        System.out.println("Printing Xml Document [name: " + name + ", contents: " + contents + "]");
    }
}