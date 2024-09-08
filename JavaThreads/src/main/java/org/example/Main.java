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
//
//        Counter counter = new Counter();
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                System.out.println("thread 1");
//                counter.increment();
//            }
//        });
//        Thread t2 = new Thread(() -> {
//
//            for (int i = 0; i < 1000; i++) {
//                System.out.println("thread 2");
//                counter.increment();
//            }
//        });
//
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//        System.out.println("Counter value : " + counter.getCount());


//
//        BankAccount hdfc = new BankAccount();
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                hdfc.withdraw(10);
//            }
//        };
//
//
//        Thread t1 = new Thread(task, "Thread 1");
//        Thread t2 = new Thread(task, "Thread 2");
//        Thread t3 = new Thread(task, "Thread 3");
//        t1.start();
//        t2.start();
//        t3.start();
//
//        t1.join();
//        t2.join();
//        t3.join();
//        System.out.println(Thread.currentThread().getName() + " current thread");


//        CounterReadWrite counter = new CounterReadWrite();
//
//        Runnable readTask = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + " counter " + counter.getCount());
//                }
//            }
//        };
//        Runnable writeTask = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    counter.increment();
//                    System.out.println(Thread.currentThread().getName() + "  incremented ");
//                }
//            }
//        };
//        Thread t1 = new Thread(writeTask, "Write thread 1");
//        Thread t2 = new Thread(readTask, "Read thread 1");
//        Thread t3 = new Thread(readTask, "Read thread 2");
//        // Thread t4 = new Thread(writeTask, "Read thread 1");
//        t1.start();
//        t2.start();
//        t3.start();
//
//        t1.join();
//        t2.join();
//        t3.join();
//        System.out.println("Final count : " + counter.getCount());
//


    }


}

