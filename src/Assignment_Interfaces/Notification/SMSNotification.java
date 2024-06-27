package Assignment_Interfaces.Notification;

public interface SMSNotification extends NotificationSender {

    void addPhoneNumber(String phoneNumber);
    void sendSMSNotification(String message);

}
