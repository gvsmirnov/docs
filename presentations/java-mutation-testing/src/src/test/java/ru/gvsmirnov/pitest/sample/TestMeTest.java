package ru.gvsmirnov.pitest.sample;

import org.junit.Assert;
import org.junit.Test;
import ru.gvsmirnov.pitest.sample.TestMe;

public class TestMeTest {

    @Test
    public void testComputeWithZeroParam() {
        final TestMe testMe = new TestMe(0);

        Assert.assertEquals(0, testMe.compute(0, 0, 0));
        Assert.assertEquals(0, testMe.compute(1, 0, 0));
    }

    @Test
    public void testCompute() {
        final TestMe testMe = new TestMe(1);

        Assert.assertEquals(1, testMe.compute(1, 1, 1));
        Assert.assertEquals(2, testMe.compute(2, 1, 1));
        Assert.assertEquals(3, testMe.compute(3, 1, 1));
        Assert.assertEquals(1, testMe.compute(3, 1, 3));
        Assert.assertEquals(0, testMe.compute(3, 0, 3));
    }
}
