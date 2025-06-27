package documentbuilder;

public class ExcelCreator extends AbstractDocumentCreator {
    @Override
    public Document createDocument() {
        return new ExcelFile();
    }
}
