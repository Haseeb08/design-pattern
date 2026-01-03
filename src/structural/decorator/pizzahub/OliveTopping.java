package structural.decorator.pizzahub;

public class OliveTopping extends ToppingsDecorator{
    protected OliveTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30.0;
    }
}
