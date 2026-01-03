package structural.decorator.pizzahub;

public class FarmHousePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public double getCost() {
        return 150.0;
    }
}
