package ru.gvsmirnov.pitest.sample;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RobustDefensiveClassTest {

    private RobustDefensiveClass subject = new RobustDefensiveClass();

    @Test
    public void testEvaluation() {
        final Map<Integer, Integer> testCases = new HashMap<>();
        {
            testCases.put(1, 1);
            testCases.put(3, 3);
            testCases.put(6, 6);
            testCases.put(-42, 0);
        }

        for(Map.Entry<Integer, Integer> entry : testCases.entrySet()) {
            Assert.assertEquals(entry.getValue().intValue(), subject.evaluate(entry.getKey()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithIllegalArgument() {
        subject.evaluate(0);
    }
}
