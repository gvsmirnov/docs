package ru.gvsmirnov.pitest.sample;

import org.junit.Assert;
import org.junit.Test;

public class MinitrueTest {

    @Test
    public void testRectify() {
        final String toRectify = "/mnt/malquoted/unpersons/rutherford";

        Minitrue.rectify(toRectify);

        Assert.assertTrue(Minitrue.isUnpath(toRectify));
    }

    @Test
    public void testRectifySecurity() {

        boolean rejected = false;

        try {
            Minitrue.rectify("/");
        } catch(SecurityException e) {
            rejected = true;
        }

        Assert.assertTrue(rejected);
        Assert.assertFalse(Minitrue.isUnpath("/"));
    }

}
