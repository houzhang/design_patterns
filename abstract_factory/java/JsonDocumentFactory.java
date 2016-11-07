public class JsonDocumentFactory implements AbstractFactory {

    public Document getDocument() {
        return new JsonDocument();
    }
}