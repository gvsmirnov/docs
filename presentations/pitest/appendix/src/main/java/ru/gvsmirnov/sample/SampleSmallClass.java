package ru.gvsmirnov.sample;

public class SampleSmallClass {

    /**
     * Always returns zero, while executing some convoluted math
     * @return zero
     */
    public static int doSomeMath(int a, int b) {
        long result = b;

        result += a;
        result -= b;
        result -= a;

        return (int) result;
    }

}
