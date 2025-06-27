package loggerutility;

public class Logger {
    private static Logger loggerInstance;

    private Logger() {
        System.out.println("Logger initialized.");
    }

    public static Logger fetchLogger() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void logMessage(String msg) {
        System.out.println("LOG: " + msg);
    }
}
