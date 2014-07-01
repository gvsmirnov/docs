package ru.gvsmirnov.sample;

public class SampleSmallClass {

    /**
     * Always returns zero, while executing some convoluted math
     * @return zero
     */
    public static int doSomeMath(int a, int b) {
        int c;

        if (a > b) {
            c = -1;
        } else if(a < b) {
            c = 1;
        } else {
            c = 100;
        }

        int d = a + b + c;
        int e = a + b;

        int x;

        if (a > b) {
            x = 1;
        } else if(a < b) {
            x = -1;
        } else {
            x = -100;
        }

        return d + x - e;
    }

}
