package com.dragomiralin.Facade;

import java.io.IOException;
import java.net.URL;

public class Upload {
    private HttpConnectionHandler http;

    public void uploadFile(String myAddress, String file) throws IOException {
        this.http = new HttpConnectionHandler(new URL(myAddress));
        http.sendBody(http.createConnection(), "POST", file);

    }

}
