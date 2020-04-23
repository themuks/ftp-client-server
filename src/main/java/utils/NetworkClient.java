package main.java.utils;

import java.io.File;

public interface NetworkClient {
    void connect(String ip, int port);
    void disconnect();
    void sendMessage(String msg);
    String getMessage();
}
