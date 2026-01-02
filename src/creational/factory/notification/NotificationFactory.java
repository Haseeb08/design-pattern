package creational.factory.notification;

public class NotificationFactory {
    public static Notification createNotificationFactory(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException(
                        "Unknown notification type : "+ type
                );
        }
    }
}
