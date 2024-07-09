package LLDAssignments.FactoryNotification;

public class SmsNotification extends Notification{


    public SmsNotification(String recipient,  String message) {
       super(recipient,message);
    }

    public void sendNotification() {
        // Logic to send an SMS
        System.out.println("SMS sent to " + recipient);
        System.out.println("Message: " + message);
    }

    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}