package awc.personaldev.contriveddiexample.good.main.injector;

import awc.personaldev.contriveddiexample.good.main.consumer.ApplicationWithDI;
import awc.personaldev.contriveddiexample.good.main.consumer.Consumer;
import awc.personaldev.contriveddiexample.good.main.service.FacebookMessengerService;

public class FacebookMessengerServiceInjector implements DirectMessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new ApplicationWithDI(new FacebookMessengerService());
    }
}
