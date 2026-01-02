package creational.factory.notification;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class HashMapBasedNotificationFactory {
    private static final Map<String, Supplier<Notification>> registry = new HashMap<>();

    static {
        registry.put("EMAIL", EmailNotification::new);
        registry.put("SMS", SMSNotification::new);
    }

    public static Notification createNotificationFactoryFromMap(String type) {
        Supplier<Notification> supplier = registry.get(type.toUpperCase());

        if (supplier == null) {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
        return supplier.get();
    }
}
