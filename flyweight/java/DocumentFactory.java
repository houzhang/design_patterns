import java.util.*;

public class DocumentFactory {

    private static final HashMap<String, Document> xmlDocumentMap = new HashMap<>();

    public static Document getDocument(String name) {
        Document document = xmlDocumentMap.get(name);

        if (document == null) {
            document= new XmlDocument(name);
            xmlDocumentMap.put(name, document);
            System.out.println("Creating Xml Document of name: " + name);
        }

        return document;
    }

}