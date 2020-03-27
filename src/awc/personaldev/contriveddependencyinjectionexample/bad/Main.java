package awc.personaldev.contriveddependencyinjectionexample.bad;

import awc.personaldev.contriveddependencyinjectionexample.bad.Application;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.processMessages("This is a bad approach.", "Andy Cathcart");
    }
}
