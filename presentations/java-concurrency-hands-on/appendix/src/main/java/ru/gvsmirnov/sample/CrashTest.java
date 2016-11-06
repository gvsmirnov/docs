package ru.gvsmirnov.sample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static java.util.concurrent.ForkJoinPool.commonPool;

public class CrashTest {

    private static boolean finished;
    private static int value;

    static void executedOnCpu0() {
        value = 10;
        finished = true;
    }

    static int executedOnCpu1() {
        while(!finished);
        return value;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new Thread(CrashTest::executedOnCpu0).start();
        System.out.println(executedOnCpu1());
    }

}
