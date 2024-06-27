package Assignment_Interfaces.Notification;

public class Email implements EmailNotification{
    @Override
    public void addRecepict(String recipient) {
        System.out.println("Adding Receipt");
    }

    @Override
    public void sendEmailNotification(String message) {
        System.out.println("Sending Email " +message);
    }

    @Override
    public void sendNotification(String message) {
        sendEmailNotification(message);
    }
}
