package org.example.threads;

public class ThreadLifeCycle extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
