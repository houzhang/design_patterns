public class XmlDocumentFactory implements AbstractFactory {

    public XmlDocumentFactory() {}

    public Document getDocument() {
        return new XmlDocument();
    }
}