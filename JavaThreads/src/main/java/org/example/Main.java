package org.example;

public class Main extends Thread {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        Main ts = new Main();
//        ts.start();

//        MyRunnable runnable = new MyRunnable();
//        Thread t1 = new Thread(runnable);
//        t1.start();
//
//        MyThread myThread = new MyThread();
//        myThread.start();

        ThreadLifeCycle threadLifeCycle = new ThreadLifeCycle();
        System.out.println("Thread life cycle : " + threadLifeCycle.getState());
        threadLifeCycle.start();

        System.out.println("Thread life cycle : " + threadLifeCycle.getState());
        try {
            threadLifeCycle.join();
          
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread life cycle : " + threadLifeCycle.getState());

    }


}

