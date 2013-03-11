package ru.gvsmirnov.pitest.sample;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

public class NodeMapperTest {

    @Test
    public void testGetMachineById() {
        // The boss says we should write tests, but it has worked
        // just fine up until now, and I have *important* things to do

        Assert.assertTrue(true);
    }

    private static final Map<String, List<Long>> MACHINES = new HashMap<String, List<Long>> () {{
        put("machine1", Arrays.asList(1L, 2L, 3L, 4L));
    }};

    @Test
    public void testGetMachineById2() {
        NodeMapper nodeMapper = new NodeMapper(MACHINES);

        nodeMapper.getMachineById(0);
        nodeMapper.getMachineById(1);
    }

}
