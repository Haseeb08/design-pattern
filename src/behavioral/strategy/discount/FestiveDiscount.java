package behavioral.strategy.discount;

public class FestiveDiscount implements DiscountStrategy{

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}
