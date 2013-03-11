package ru.gvsmirnov.pitest.sample;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

public class NodeMapperTest {

    private static final String TEST_MACHINE_NAME = "machine1";

    @Test
    public void testGetMachineById() {
        // The boss says we should write tests, but it has worked
        // just fine up until now, and I have *important* things to do

        Assert.assertTrue(true);
    }

    private static final Map<String, List<Long>> MACHINES = new HashMap<String, List<Long>> () {{
        put(TEST_MACHINE_NAME, Arrays.asList(1L, 2L, 3L, 4L));
    }};

    @Test
    public void testGetMachineById2() {
        NodeMapper nodeMapper = new NodeMapper(MACHINES);

        nodeMapper.getMachineById(0);
        nodeMapper.getMachineById(1);
    }

    @Test
    public void testGetMachineById3() {
        NodeMapper nodeMapper = new NodeMapper(MACHINES);

        Assert.assertEquals(NodeMapper.DEFAULT_MACHINE_NAME, nodeMapper.getMachineById(0));
        Assert.assertEquals(TEST_MACHINE_NAME, nodeMapper.getMachineById(1));
    }

    @Test
    public void testGetMachineById4() {
        final String defaultMachineName = "myDefault";
        NodeMapper nodeMapper = new NodeMapper(MACHINES, defaultMachineName);

        // Will fail because the defaultMachineName is not actually used by NodeMapper
        Assert.assertEquals(defaultMachineName, nodeMapper.getMachineById(0));
        Assert.assertEquals(TEST_MACHINE_NAME, nodeMapper.getMachineById(1));
    }

}
