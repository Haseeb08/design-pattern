package creational.factory.NotificationEnumBased;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Notification sent - SMS");
    }
}
