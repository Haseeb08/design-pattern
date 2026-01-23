package behavioral.strategy.discount;

public class NoDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }
}
