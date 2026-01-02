package creational.singleton.logger;

/**
 * Thread safe - Singleton with double checked locking
 * <p>
 * - Uses lazy initialization (instance created only when needed)
 * - Uses synchronization only during first object creation
 * - Double check avoids unnecessary locking after instance is created
 *
 */
public class ThreadSafeLogger {

    /**
     * Volatile ensures:
     * - Visibility of changes across threads
     * - Prevents instruction reordering issues
     */
    private static volatile ThreadSafeLogger logger;

    private ThreadSafeLogger() {
        System.out.println("ThreadSafeLogger instance created");
    }

    /**
     * Returns the single instance of ThreadSafeLogger
     * <p>
     * Step-by-step working:
     * 1. First 'if' check avoids synchronization once instance is created
     * 2. synchronized block ensures only one thread enters at a time
     * 3. Second 'if' check ensures instance is still null
     * (in case multiple threads were waiting)
     * 4. Instance is created only once
     */
    public static ThreadSafeLogger getInstance() {
        if (logger == null) {
            synchronized (ThreadSafeLogger.class) {
                if (logger == null) {
                    logger = new ThreadSafeLogger();
                }
            }
        }
        return logger;
    }
}
