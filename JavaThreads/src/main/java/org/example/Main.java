package org.example;


import org.example.threads.Counter;

public class Main extends Thread {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println("Hello world!");
//        Main ts = new Main();
//        ts.start();

//        MyRunnable runnable = new MyRunnable();
//        Thread t1 = new Thread(runnable);
//        t1.start();
//
//        MyThread myThread = new MyThread();
//        myThread.start();

//        ThreadLifeCycle threadLifeCycle = new ThreadLifeCycle();
//        System.out.println("Thread life cycle : " + threadLifeCycle.getState());
//        threadLifeCycle.start();
//
//        System.out.println("Thread life cycle : " + threadLifeCycle.getState());
//        try {
//            threadLifeCycle.join();
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Thread life cycle : " + threadLifeCycle.getState());
//
//

        // Synchronized

        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("thread 1");
                counter.increament();
            }
        });
        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                System.out.println("thread 2");
                counter.increament();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Counter value : " + counter.getCount());
    }


}

