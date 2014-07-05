package ru.gvsmirnov.sample;

public class SampleSmallClass {

    /**
     * Always returns zero, while executing some convoluted math
     * @return zero
     */
    public static int doSomeMath(int a, int b) {
        long result = 0;

        result += a;
        result -= b;

        return (int) result;
    }

}
