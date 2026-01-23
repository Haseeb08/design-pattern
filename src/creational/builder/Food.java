package creational.builder;

public class Food {
    private String name;
    private String category;

    // optionals
    private boolean isExpired;
    private double price;

    public Food(FoodBuilder foodBuilder) {
        this.name = foodBuilder.name;
        this.category = foodBuilder.category;
        this.isExpired = foodBuilder.isExpired;
        this.price = foodBuilder.price;
    }

    public static class FoodBuilder {
        private String name;
        private String category;

        // optionals
        private boolean isExpired;
        private double price;

        public FoodBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public FoodBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public FoodBuilder setExpired(boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }

        public FoodBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Food build() {
            return new Food(this);
        }
    }
}
