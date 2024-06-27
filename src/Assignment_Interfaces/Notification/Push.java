package Assignment_Interfaces.Notification;

public class Push implements PushNotification{

    @Override
    public void enablePushNotification(String message) {
        System.out.println("Sending Push Notification " +message);
    }

    @Override
    public void sendNotification(String message) {
        sendNotification(message);
    }
}
