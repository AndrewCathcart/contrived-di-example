package awc.personaldev.contriveddiexample.good.test;

import awc.personaldev.contriveddiexample.good.main.consumer.ApplicationWithDI;
import awc.personaldev.contriveddiexample.good.main.consumer.Consumer;
import awc.personaldev.contriveddiexample.good.main.injector.DirectMessageServiceInjector;
import awc.personaldev.contriveddiexample.good.main.service.DirectMessageService;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationWithDITest {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    private DirectMessageServiceInjector injector;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        injector = () -> new ApplicationWithDI((message, recipient) -> System.out.print("Mocked Message."));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        injector = null;
        System.setOut(originalOut);
    }

    @org.junit.jupiter.api.Test
    void processMessages() {
        // Arrange
        Consumer consumer = injector.getConsumer();

        // Act
        consumer.processMessages("Hi Andy", "@andycathcart");

        // Assert
        assertEquals("Mocked Message.", outContent.toString());
    }
}