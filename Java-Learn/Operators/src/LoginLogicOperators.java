import java.util.Scanner;

public class LoginLogicOperators {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        boolean isAuthenticated = (inputUsername.trim().equals(username) && inputPassword.trim().equals(password));
        if (isAuthenticated) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }

    }
}
