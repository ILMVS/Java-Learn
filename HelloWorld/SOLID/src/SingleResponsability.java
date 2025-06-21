//The problem that we have here is that the User class is responsible
// or both user data and saving the user to the database.


//we could be more specific using Interfaces, also we could make a Generic repository as the pattern recommend.
public class SingleResponsability {
    public static void main(String[] args) {

        // Create a new user
        User user = new User("John Doe", "JDoe@email.com");

        // Save the user to the database
        userRepository.saveUser(user);
    }
}


class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // This method violates the Single Responsibility Principle
//    public void saveUser() {
//        // Code to save user to database
//        System.out.println("User saved: " + name);
//    }
}

class userRepository {

    public static void saveUser(User user) {
        System.out.println("User saved: " + user.getName());
    }
}