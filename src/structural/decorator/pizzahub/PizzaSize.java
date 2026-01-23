package structural.decorator.pizzahub;

public enum PizzaSize {
    SMALL(0),
    MEDIUM(50),
    LARGE(100);

    private final double cost;

    public double getCost() {
        return cost;
    }

    PizzaSize(double cost) {
        this.cost = cost;
    }
}
