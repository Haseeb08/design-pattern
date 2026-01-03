package structural.decorator.pizzahub;

public class PizzaDecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza1 = new CheezeTopping(
                new MargheritaPizza()
        );
        System.out.println(pizza1.getDescription());
        System.out.println("Total Cost: ₹" + pizza1.getCost());

        Pizza pizza2 = new CheezeTopping(
                new OliveTopping(
                        new MushroomTopping(
                                new FarmHousePizza()
                        )
                )
        );
        System.out.println(pizza2.getDescription());
        System.out.println("Total Cost: ₹" + pizza2.getCost());
    }
}
