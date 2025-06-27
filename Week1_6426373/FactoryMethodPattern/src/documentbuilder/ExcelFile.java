package documentbuilder;

public class ExcelFile implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel spreadsheet...");
    }
}
