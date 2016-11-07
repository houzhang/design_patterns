class Main {
    public static void main(String args[]) {
        Document xmlDocument = new XmlDocumentFactory().getDocument();
        xmlDocument.print();

        Document jsonDocument = new JsonDocumentFactory().getDocument();
        jsonDocument.print();
    }
}