package creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        User user = new User.Builder().setName("Test")
                .setAge(24)
                .setActive(true)
                .setEmail("abc@gmail.com")
                .setPhone("1234")
                .build();

        System.out.println("User name - " + user.getName());

        Food pizza = new Food.FoodBuilder()
                .setName("Margherita")
                .setExpired(false)
                .setCategory("Veg").build();
        System.out.println("Food Name - "+ pizza);
    }
}
