package ru.gvsmirnov.pitest.sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NodeMapper {

    public static final String DEFAULT_MACHINE_NAME = "localhost";

    private final Map<Long, String> nodeId2machine;
    private final String defaultMachineName;

    public NodeMapper(Map<String, ? extends Iterable<Long>> machines, String defaultMachineName) {

        Map<Long, String> nodeId2machine = new HashMap<>();

        for (Map.Entry<String, ? extends Iterable<Long>> entry : machines.entrySet()) {
            String machineName = entry.getKey();
            for(Long nodeId : entry.getValue()) {
                nodeId2machine.put(nodeId, machineName);
            }
        }

        this.nodeId2machine = Collections.unmodifiableMap(nodeId2machine);
        this.defaultMachineName = defaultMachineName;
    }

    public NodeMapper(Map<String, ? extends Iterable<Long>> machines) {
        this(machines, DEFAULT_MACHINE_NAME);
    }

    public String getMachineById(long nodeId) {
        if(nodeId2machine.containsKey(nodeId)) {
            return nodeId2machine.get(nodeId);
        } else {
            // purposefully not using member variable defaultMachineName
            // to demonstrate that PIT catches the error
            return DEFAULT_MACHINE_NAME;
        }
    }

}
