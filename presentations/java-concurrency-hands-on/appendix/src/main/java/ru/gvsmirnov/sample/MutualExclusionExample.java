package ru.gvsmirnov.sample;

import java.util.concurrent.locks.ReentrantLock;

public class MutualExclusionExample {

    private long lastUserId;
    private Action lastAction;

    public void execute(Action action, long userId) {
        action.execute();
        this.lastUserId = userId;
        this.lastAction = action;
    }

    public void executeSynchronized(Action action, long userId) {
        synchronized (this) {
            execute(action, userId);
        }
    }

    private final ReentrantLock lock = new ReentrantLock();

    public void executeLocked(Action action, long userId) {
        lock.lock();
        try {
            execute(action, userId);
        } finally {
            lock.unlock();
        }
    }

    private static class Action {
        void execute() {}
    }

}
