package awc.personaldev.contriveddiexample.good.main;

import awc.personaldev.contriveddiexample.good.main.consumer.Consumer;
import awc.personaldev.contriveddiexample.good.main.injector.DirectMessageServiceInjector;
import awc.personaldev.contriveddiexample.good.main.injector.FacebookMessengerServiceInjector;
import awc.personaldev.contriveddiexample.good.main.injector.TwitterMessengerServiceInjector;

public class Main {
    public static void main(String[] args) {
        String message = "Hey Andy.";
        String twitterUsername = "@andycathcart";
        String facebookUsername = "Andy Cathcart";

        DirectMessageServiceInjector injector = new TwitterMessengerServiceInjector();
        Consumer app = injector.getConsumer();

        // Send a message over Twitter
        app.processMessages(message, twitterUsername);

        // Send a message over Facebook
        injector = new FacebookMessengerServiceInjector();
        app = injector.getConsumer();
        app.processMessages(message, facebookUsername);
    }
}
