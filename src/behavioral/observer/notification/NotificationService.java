package behavioral.observer.notification;

public class NotificationService {
    public static void main(String[] args) {
        Order order = new Order();

        order.addObserver(new EmailObserver());
        order.addObserver(new SMSObserver());

        order.setStatus("PLACED");
        order.setStatus("SHIPPED");
    }
}
