package awc.personaldev.contriveddependencyinjectionexample.bad;

public class FacebookMessengerService {
    public void sendMessage(String message, String recipient) {
        System.out.println(
                String.format("Sending message \"%s\" to %s over Facebook Messenger.", message, recipient)
        );
    }
}