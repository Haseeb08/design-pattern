package creational.singleton.logger;

/**
 * Enum-based Singleton
 * <p>
 * Ensures exactly one instance of Logger
 * Why Enum:
 * - Thread-safe by default
 * - JVM guarantees single instance per enum constant
 * - Safe from reflection attacks
 * - Safe from serialization/deserialization
 * <p>
 * This is the recommended way to implement Singleton in Java.
 */
public enum EnumLogger {

    // Single instance of logger
    LOGGER;

    public void log(String msg) {
        System.out.println("[ENUM LOG] " + msg);
    }
}
