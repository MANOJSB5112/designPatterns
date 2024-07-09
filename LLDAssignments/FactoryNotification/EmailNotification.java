package LLDAssignments.FactoryNotification;

public class EmailNotification extends Notification {

    private String sender;

    public EmailNotification(String recipient, String message, String sender) {
        super(recipient, message);
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }


    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + recipient + " from " + sender);
        System.out.println("Message: " + super.message);
    }

    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}