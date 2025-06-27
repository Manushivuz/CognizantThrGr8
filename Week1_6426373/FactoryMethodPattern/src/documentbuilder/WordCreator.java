package documentbuilder;

public class WordCreator extends AbstractDocumentCreator {
    @Override
    public Document createDocument() {
        return new WordFile();
    }
}
