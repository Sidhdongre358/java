package org.example;

public class Main extends Thread {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        Main ts = new Main();
        ts.start();

    }

    public void run() {
        System.out.println("Thread Started....");
    }
}

