package Assignment_Interfaces.Notification;

public interface EmailNotification extends NotificationSender {

    void addRecepict(String recipient);
    void sendEmailNotification(String message);

}
