package LLDAssignments.FactoryNotification;

public class PushNotification extends Notification{

    public PushNotification(String recipient, String message) {
        super(recipient,message);
    }

    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + recipient);
        System.out.println("Message: " + message);
    }

    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}