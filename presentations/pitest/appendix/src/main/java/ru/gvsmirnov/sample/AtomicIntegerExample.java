package ru.gvsmirnov.sample;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    private final AtomicInteger counter = new AtomicInteger();

    public int increment() {
        return counter.incrementAndGet();
    }

}
