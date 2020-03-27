package java.awc.personaldev.contriveddiexample.good.service;

public class TwitterMessengerService implements DirectMessageService{
    @Override
    public void sendDirectMessage(String message, String recipient) {
        System.out.println(
                String.format("Sending direct message \"%s\" to %s on Twitter.", message, recipient)
        );
    }
}
