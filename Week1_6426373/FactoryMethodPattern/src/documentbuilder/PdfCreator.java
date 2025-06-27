package documentbuilder;

public class PdfCreator extends AbstractDocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfFile();
    }
}
