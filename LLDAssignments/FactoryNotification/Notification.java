package LLDAssignments.FactoryNotification;

import javax.xml.ws.ServiceMode;


public abstract class Notification {

    protected String message;
    protected String recipient;
    public Notification(String recipient, String message) {
        this.message = message;
        this.recipient=recipient;
    }
    public abstract NotificationType notificationType();
    public abstract void sendNotification();

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }


}