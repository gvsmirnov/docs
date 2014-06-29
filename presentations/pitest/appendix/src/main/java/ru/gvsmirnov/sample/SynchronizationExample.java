package ru.gvsmirnov.sample;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizationExample {

    private boolean condition = false;

    public void awaitSynchronized() throws InterruptedException {
        synchronized (this) {
            while(!condition) {
                wait();
            }
        }
    }

    public void setSynchronized() {
        synchronized (this) {
            condition = true;
            notifyAll();
        }
    }

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition cond = lock.newCondition();

    public void awaitLocked() throws InterruptedException {
        lock.lock();
        try {
            while(!condition) {
                cond.await();
            }
        } finally {
            lock.unlock();
        }
    }

    public void setLocked() {
        lock.lock();
        try {
            condition = true;
            cond.signalAll();
        } finally {
            lock.unlock();
        }
    }

    private final CountDownLatch latch = new CountDownLatch(1);

    public void awaitLatched() throws InterruptedException {
        latch.await();
    }

    public void setLatched() {
        latch.countDown();
    }

}
