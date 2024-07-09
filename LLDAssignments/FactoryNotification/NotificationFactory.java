package LLDAssignments.FactoryNotification;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class NotificationFactory {

        public static Notification  createNotification(NotificationType type, String recipient, String message, String sender) {
        switch (type) {
            case EMAIL:
                return new EmailNotification(recipient, message, sender);
            case SMS:
                return new SmsNotification(recipient, message);
            case PUSH:
                return new PushNotification(recipient, message);
            default:
                throw new IllegalArgumentException("Unknown notification type " + type);
        }
    }
}
