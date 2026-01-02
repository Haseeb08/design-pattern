package creational.factory.notification;

import static creational.factory.notification.HashMapBasedNotificationFactory.createNotificationFactoryFromMap;
import static creational.factory.notification.NotificationFactory.createNotificationFactory;

public class FactoryDemo {
    public static void main(String[] args) {
        Notification email = createNotificationFactory("EMAIL");
        email.notifyUser();
        Notification sms = createNotificationFactory("SMS");
        sms.notifyUser();

        // ------------------------------------------------------------- //
        // ------------- HashMap Based --------------------------------- //
        Notification email1 = createNotificationFactoryFromMap("EMAIL");
        email1.notifyUser();

        Notification sms1 = createNotificationFactoryFromMap("SMS");
        sms1.notifyUser();
    }
}
