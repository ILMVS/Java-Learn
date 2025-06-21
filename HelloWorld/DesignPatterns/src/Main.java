//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Singleton example
        Singleton singletonInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        if( singletonInstance == secondInstance ) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Instances are different.");
        }

        Notification notification = NotificationFactory.createNotification("email");
        notification.notifyUser();

    }
}