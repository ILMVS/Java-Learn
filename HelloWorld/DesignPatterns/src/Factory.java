
interface Notification {
    void notifyUser();
}
public class Factory {
    public static void main(String[] args) {

    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email Notification Sent");
    }
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification Sent");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Push Notification Sent");
    }
}

class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                return null;
        }
    }
}