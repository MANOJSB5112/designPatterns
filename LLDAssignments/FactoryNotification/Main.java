package LLDAssignments.FactoryNotification;

public class Main {
    public static void main(String[] args) {
        Notification notification;
        notification=NotificationFactory.createNotification(NotificationType.PUSH,",manojsb@gmail.com","Welcome Manoj this is SMS Notification","dddd@scaler.com");
        notification.sendNotification();
    }
}
