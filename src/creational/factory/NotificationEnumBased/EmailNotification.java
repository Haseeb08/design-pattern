package creational.factory.NotificationEnumBased;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Notification sent - Email");
    }
}