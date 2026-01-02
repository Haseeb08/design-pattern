package creational.builder;

public class User {
    // required fields
    private final String name;
    private final String email;

    // optional fields
    private final int age;
    private final String phone;
    private final boolean active;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.active = builder.active;
    }

    // getters only (immutable object)
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isActive() {
        return active;
    }

    // Builder class

    public static class Builder {
        // required fields
        private String name;
        private String email;

        // optional fields
        private int age;
        private String phone;
        private boolean active;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public User build() {
            // Also can add validations here
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            return new User(this);
        }
    }
}
