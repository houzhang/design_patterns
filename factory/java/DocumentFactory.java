public class DocumentFactory  {

    public Document getDocument(String type) {

        if (type == "XML") {
            return new XmlDocument();
        } else if (type == "JSON") {
            return new JsonDocument();
        }

        return null;
    }
}