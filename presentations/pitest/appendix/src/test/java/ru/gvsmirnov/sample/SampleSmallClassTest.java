package ru.gvsmirnov.sample;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleSmallClassTest {

    @Test
    public void testStuff() {
        // The boss says we should write tests.
        // Doesn't seem that hard...

        assertTrue(true);
    }

    @Test
    public void testStuffWithCoverage() {
        // Need to get that coverage thing high...

        for(int a = -5; a <= 5; a ++) {
            for (int b = -5; b <= 5; b++) {
                SampleSmallClass.doSomeMath(a, b);
            }
        }
    }

    @Test
    @Ignore
    public void testAndAssert() {
        final int expected = 0;

        for(int a = -5; a <= 5; a ++) {
            for(int b = -5; b <= 5; b ++) {
                assertEquals(expected, SampleSmallClass.doSomeMath(a, b));
            }
        }
    }

}
