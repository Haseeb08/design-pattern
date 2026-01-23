package structural.decorator.pizzahub;

public class SizeDecorator extends ToppingsDecorator {

    private final PizzaSize size;

    public SizeDecorator(Pizza pizza, PizzaSize pizzaSize) {
        super(pizza);
        this.size=pizzaSize;
    }

    @Override
    public String getDescription() {
        return size.name() + " " + pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost() + size.getCost();
    }
}
