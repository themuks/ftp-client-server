package main.java.utils;

import java.io.*;
import java.net.Socket;
import java.util.Random;

public class TcpClient implements NetworkClient{
    private Socket clientSocket;
    private BufferedWriter out;
    private BufferedReader in;

    @Override
    public void connect(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Resender resender = new Resender(in);
            resender.start();
            System.out.println("Connected to server! You can type now!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void disconnect() {
        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendMessage(String msg) {
        try {
            out.write("Client: " + msg + "\n");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getMessage() {
        return null;
    }
}
