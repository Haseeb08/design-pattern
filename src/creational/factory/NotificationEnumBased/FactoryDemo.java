package creational.factory.NotificationEnumBased;

import static creational.factory.NotificationEnumBased.NotificationFactory.createNotificationFactory;
import static creational.factory.NotificationEnumBased.NotificationType.EMAIL;
import static creational.factory.NotificationEnumBased.NotificationType.SMS;

public class FactoryDemo {
    public static void main(String[] args) {
        Notification email = createNotificationFactory(EMAIL);
        email.notifyUser();
        Notification sms = createNotificationFactory(SMS);
        sms.notifyUser();
    }
}
