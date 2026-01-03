package structural.decorator.pizzahub;

public class MushroomTopping extends ToppingsDecorator{
    protected MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", extra mushroom";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 60.0;
    }
}
