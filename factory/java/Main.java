class Main {
    public static void main(String args[]) {
        DocumentFactory documentFactory = new DocumentFactory();

        Document xmlDocument = documentFactory.getDocument("XML");
        xmlDocument.print();

        Document jsonDocument = documentFactory.getDocument("JSON");
        jsonDocument.print();
    }
}