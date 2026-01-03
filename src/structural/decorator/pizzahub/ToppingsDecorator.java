package structural.decorator.pizzahub;

public abstract class ToppingsDecorator implements Pizza {
    protected final Pizza pizza;

    protected ToppingsDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}