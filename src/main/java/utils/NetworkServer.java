package main.java.utils;

import java.io.File;

public interface NetworkServer {
    void start(int port);
    void stop();
    void sendMessage(String msg);
    String getMessage();
}
