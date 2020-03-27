package awc.personaldev.contriveddiexample.good.main.consumer;

import awc.personaldev.contriveddiexample.good.main.service.DirectMessageService;

public class ApplicationWithDI implements Consumer {
    private DirectMessageService service;

    public ApplicationWithDI(DirectMessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String message, String recipient) {
        this.service.sendDirectMessage(message, recipient);
    }
}
