package behavioral.strategy.discount;

public class BillingService {

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalAmount(double amount) {
        return discountStrategy.applyDiscount(amount);
    }
}
