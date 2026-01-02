package creational.singleton.logger;

/**
 * Lazy Initalization
 * Instance created when requested first
 * Not Thread safe
 */
public class LazyLogger {
    private static LazyLogger logger;

    private LazyLogger() {
        System.out.println("Logger instance created - Lazy");
    }

    public static LazyLogger getInstance() {
        if (logger == null) {
            logger = new LazyLogger();
        }
        return logger;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
