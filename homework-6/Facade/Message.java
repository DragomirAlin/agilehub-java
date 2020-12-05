package com.dragomiralin.Facade;

import java.io.IOException;
import java.net.URL;

public class Message {
    private HttpConnectionHandler http;

    public void sendMessage(String myAddress, String myMessage) throws IOException {
        this.http = new HttpConnectionHandler(new URL(myAddress));
        http.sendBody(http.createConnection(), "POST", myMessage);

    }
}
