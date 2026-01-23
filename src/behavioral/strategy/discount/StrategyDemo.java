package behavioral.strategy.discount;

public class StrategyDemo {
    public static void main(String[] args) {
        BillingService billingService = new BillingService();
        double amount = 1000.0;

        billingService.setDiscountStrategy(new NoDiscount());
        System.out.println("No Discount: " + billingService.calculateFinalAmount(amount));

        billingService.setDiscountStrategy(new FestiveDiscount());
        System.out.println("Festival Discount: " + billingService.calculateFinalAmount(amount));

        billingService.setDiscountStrategy(new PremiumDiscount());
        System.out.println("Premium Discount: " + billingService.calculateFinalAmount(amount));
    }
}
