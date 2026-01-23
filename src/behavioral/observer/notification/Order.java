package behavioral.observer.notification;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private String status;

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs: observers) {
            obs.update(status);
        }
    }
}
