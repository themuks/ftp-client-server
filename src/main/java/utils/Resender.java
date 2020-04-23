package main.java.utils;

import java.io.BufferedReader;
import java.io.IOException;

public class Resender extends Thread {

    private boolean isStoped = false;
    private BufferedReader in;

    public Resender(BufferedReader in) {
        this.in = in;
    }

    public void setStop() {
        isStoped = true;
    }

    @Override
    public void run() {
        try {
            while (!isStoped) {
                String str = in.readLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
