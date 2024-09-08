package org.example.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started from Extend Threads class");
    }
}
