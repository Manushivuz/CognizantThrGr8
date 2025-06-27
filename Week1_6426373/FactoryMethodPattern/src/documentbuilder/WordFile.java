package documentbuilder;

public class WordFile implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Microsoft Word file...");
    }
}
