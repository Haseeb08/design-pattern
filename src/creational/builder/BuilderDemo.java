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
    }
}
