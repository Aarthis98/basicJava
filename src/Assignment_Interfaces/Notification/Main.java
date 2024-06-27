package Assignment_Interfaces.Notification;

public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        SMS sms = new SMS();
        Push push = new Push();

        email.sendEmailNotification("Email Notification");
        sms.sendSMSNotification("SMS Notification");
        push.enablePushNotification("Push Message");
    }
}
