import java.util.UUID;

public class Main {

    private static final String names[] = {"Person", "Account", "Address"};

    public static void main(String[] args) {

        for (int i=0; i<20; i++) {
            XmlDocument document = (XmlDocument)DocumentFactory.getDocument(getRandomName());
            document.setContents(UUID.randomUUID().toString());
            document.print();
        }
    }

    private static String getRandomName() {
        return names[(int)(Math.random()*names.length)];
    }
}