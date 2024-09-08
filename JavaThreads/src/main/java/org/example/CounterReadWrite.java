package org.example;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CounterReadWrite {

    private int count = 0;

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void increment() {

        lock.writeLock().lock();
        try {
            count++;
        } finally {
            lock.writeLock().unlock();
        }

    }

    public int getCount() {
        lock.readLock().lock();
        try {
            return count;
        } finally {
            lock.readLock().unlock();
        }
    }

}



