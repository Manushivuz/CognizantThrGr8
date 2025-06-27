package loggerutility;

public class LoggerTest {
    public static void main(String[] args) {
        Logger log1 = Logger.fetchLogger();
        Logger log2 = Logger.fetchLogger();

        log1.logMessage("Initiating first process.");
        log2.logMessage("Continuing from second module.");

        if (log1 == log2) {
            System.out.println("Confirmed: Both references pointing to same logger instance.");
        } else {
            System.out.println("Error: Logger instances are different");
        }
    }
}
