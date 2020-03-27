package awc.personaldev.contriveddiexample.bad.main.java;

public class Application {
    private FacebookMessengerService facebookMessenger = new FacebookMessengerService();

    public void processMessages(String message, String recipient) {
        this.facebookMessenger.sendMessage(message, recipient);
    }
}
