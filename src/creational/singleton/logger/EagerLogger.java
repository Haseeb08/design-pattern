package creational.singleton.logger;

/**
 * Eager Initialization
 * Instance created at class loading time
 * Memory wasted if logger is not used
 * Thread safe
 */
public class EagerLogger {
    private static final EagerLogger logger = new EagerLogger();

    private EagerLogger() {
        System.out.print("Logger instance created - Eagerly");
    }

    public static EagerLogger getInstance() {
        return logger;
    }

    public void log(String msg) {
        System.out.print("LOG - " + msg);
    }
}
