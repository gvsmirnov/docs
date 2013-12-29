package ru.gvsmirnov.pitest.sample;

public class RobustDefensiveClass {

    public int evaluate(final int distance) {
        if(distance == 0) {
            throw new IllegalArgumentException("Distance should be non-zero");
        }

        int result = 0;

        if(distance > 0) {
            result += calculateDistanceAdjustment(distance);
        }

        return result;
    }

    private int calculateDistanceAdjustment(int distance) {

        int adjustment = distance;

        //...

        return adjustment;
    }

}
