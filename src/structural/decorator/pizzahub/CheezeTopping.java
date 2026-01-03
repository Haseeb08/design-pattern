package structural.decorator.pizzahub;

public class CheezeTopping extends ToppingsDecorator {
    protected CheezeTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", extra cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50.0;
    }
}
