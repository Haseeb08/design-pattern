package behavioral.observer.notification;

public class EmailObserver implements Observer{
    @Override
    public void update(String status) {
        System.out.println("Email sent: Order status - "+ status);
    }
}
