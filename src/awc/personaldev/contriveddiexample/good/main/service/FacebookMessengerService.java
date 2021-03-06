package awc.personaldev.contriveddiexample.good.main.service;

public class FacebookMessengerService implements DirectMessageService {
    @Override
    public void sendDirectMessage(String message, String recipient) {
        System.out.println(
                String.format("Sending direct message \"%s\" to %s on Facebook.", message, recipient)
        );
    }
}
