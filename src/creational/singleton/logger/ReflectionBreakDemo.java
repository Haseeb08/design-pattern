package creational.singleton.logger;

import java.lang.reflect.Constructor;

public class ReflectionBreakDemo {

    public static void main(String[] args) throws Exception {

        // Normal singleton instance
        ThreadSafeLogger instance1 = ThreadSafeLogger.getInstance();

        // Use reflection to access private constructor
        Constructor<ThreadSafeLogger> constructor =
                ThreadSafeLogger.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        // Create a NEW instance using reflection
        ThreadSafeLogger instance2 = constructor.newInstance();

        System.out.println("Instance 1 hash: " + instance1.hashCode());
        System.out.println("Instance 2 hash: " + instance2.hashCode());

        System.out.println(instance1 == instance2); // false ❌
    }
}
