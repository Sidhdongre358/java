package org.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance = 1000;
    private final Lock lock = new ReentrantLock();

//    public synchronized void withdraw(double amount) {
//        System.out.println(Thread.currentThread().getName() + "  attempting to withdraw the amount " + amount);
//        if (balance >= amount) {
//            System.out.println(Thread.currentThread().getName() + "  proceeding with withdrawal");
//            try {
//                Thread.sleep(5000);
//                // time for data base operations
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + "  withdrawal completed & avalable bal " + balance);
//        } else {
//            System.out.println(Thread.currentThread().getName() + "  insufficient balance & withdraw amount is " + amount);
//        }
//    }

    // Applying manually lock and unlock

    public void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + "  attempting to withdraw the amount " + amount);

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {

                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + "  proceeding with withdrawal");
                    try {
                        Thread.sleep(5000);
                        // time for data base operations
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "  withdrawal completed & avalable bal " + balance);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "  insufficient balance & withdraw amount is " + amount);
                }

            } else {
                System.out.println(Thread.currentThread().getName() + " Could not acquire the lock please try again later");
            }
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " " + e);

        }
    }


}
