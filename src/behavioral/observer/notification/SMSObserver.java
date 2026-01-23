package behavioral.observer.notification;

public class SMSObserver implements Observer{
    @Override
    public void update(String status) {
        System.out.println("SMS sent: Order status - "+ status);
    }
}
