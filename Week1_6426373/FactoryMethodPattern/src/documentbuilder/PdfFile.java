package documentbuilder;

public class PdfFile implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF file...");
    }
}
