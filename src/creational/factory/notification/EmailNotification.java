package creational.factory.notification;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notification sent - Email");
    }
}