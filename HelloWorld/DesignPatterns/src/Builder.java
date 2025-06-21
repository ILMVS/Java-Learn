public class Builder {
}

class User {
    private String name;
    private String email;
    private int age;

    // Private constructor to enforce the use of Builder
    User(UserBuilder builder) {
        this.name = builder.getName();
        this.email = builder.getEmail();
        this.age = builder.getAge();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

class UserBuilder {
    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public User build() {
        return new User(this);
    }
}