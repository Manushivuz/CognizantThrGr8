package documentbuilder;

public class DocumentFactoryTest {
    public static void main(String[] args) {
        AbstractDocumentCreator wordMaker = new WordCreator();
        Document wordDoc = wordMaker.createDocument();
        wordDoc.open();

        AbstractDocumentCreator pdfMaker = new PdfCreator();
        Document pdfDoc = pdfMaker.createDocument();
        pdfDoc.open();

        AbstractDocumentCreator excelMaker = new ExcelCreator();
        Document excelDoc = excelMaker.createDocument();
        excelDoc.open();
    }
}
