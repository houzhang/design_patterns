public class DocumentMaker {

    private Document jsosnDocument;
    private Document xmlDocuemnt;

    public DocumentMaker() {
        jsosnDocument = new JsonDocument();
        xmlDocuemnt = new XmlDocument();
    }

    public void printJsonDocument() {
        jsosnDocument.print();
    }

    public void printXmlDocument() {
        xmlDocuemnt.print();
    }
}