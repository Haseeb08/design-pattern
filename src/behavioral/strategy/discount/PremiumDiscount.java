package behavioral.strategy.discount;

public class PremiumDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.7;
    }
}
