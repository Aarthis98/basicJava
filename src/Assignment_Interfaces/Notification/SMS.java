package Assignment_Interfaces.Notification;

public class SMS implements SMSNotification{
    @Override
    public void addPhoneNumber(String phoneNumber) {
        System.out.println("Mobile number added");
    }

    @Override
    public void sendSMSNotification(String message) {
        System.out.println("SMS " +message);
    }

    @Override
    public void sendNotification(String message) {
        sendSMSNotification(message);
    }
}
