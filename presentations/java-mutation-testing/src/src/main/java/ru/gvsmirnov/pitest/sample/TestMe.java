package ru.gvsmirnov.pitest.sample;

public class TestMe {

    private final int param;

    public TestMe(int param) {
        this.param = param;
    }

    /**
     * Computes param * (a + b - c)
     */
    public int compute(int a, int b, int c) {
        return a * param + b * param - c;
    }

}
