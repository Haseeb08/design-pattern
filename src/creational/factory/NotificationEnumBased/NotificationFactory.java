package creational.factory.NotificationEnumBased;

public class NotificationFactory {
    public static Notification createNotificationFactory(NotificationType type) {
       return type.create();
    }
}
