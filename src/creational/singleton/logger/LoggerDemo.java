package creational.singleton.logger;

import static creational.singleton.logger.EnumLogger.LOGGER;

public class LoggerDemo {
    public static void main(String[] args) {
        System.out.println("\n---- Lazy Singleton ----");
        LazyLogger lazy1 = LazyLogger.getInstance();
        LazyLogger lazy2 = LazyLogger.getInstance();
        System.out.println(lazy1 == lazy2);
        System.out.println("Hashcodes - " + lazy1.hashCode() + " " +lazy2.hashCode());


        System.out.println("\n---- Eager Singleton ----");
        EagerLogger eager1 = EagerLogger.getInstance();
        EagerLogger eager2 = EagerLogger.getInstance();
        System.out.println(eager1 == eager2);
        System.out.println("Hashcodes - " + eager1.hashCode() + " " +eager2.hashCode());

        System.out.print("\n---- Thread safe Singleton ----");
        ThreadSafeLogger threadSafeLogger1 = ThreadSafeLogger.getInstance();
        ThreadSafeLogger threadSafeLogger2 = ThreadSafeLogger.getInstance();
        System.out.println(threadSafeLogger1 == threadSafeLogger1);
        System.out.println("Hashcodes - " + threadSafeLogger1.hashCode() + " " + threadSafeLogger2.hashCode());


        System.out.print("\n---- Enum Singleton ----");
        System.out.println("Enum logger - " + LOGGER.hashCode());

    }
}
