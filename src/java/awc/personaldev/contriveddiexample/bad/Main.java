package java.awc.personaldev.contriveddiexample.bad;

/*
Application class is responsible for initializing the FacebookMessengerService and then using it.
This results in a hardcoded dependency - if we want to switch to some other messaging service in the future it will require code changes inside the Application class.
This makes our application hard to extend - if the FacebookMessengerService is used in multiple classes then that furthers the difficulty.
If we wanted to extend this application to provide additional messaging features, such as direct messages on Twitter, we'd need to write another application.
Testing this application will be difficult as it directly creates an instance of FacebookMessengerService, no way we can mock these private services.
 */
public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.processMessages("This is a bad approach.", "Andy Cathcart");
    }
}
