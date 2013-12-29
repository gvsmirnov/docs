package ru.gvsmirnov.pitest.sample;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Minitrue {

    public static void rectify(String path) {
        ensurePathIsSecure(path);

        rmRf(path);
    }


    public static boolean isUnpath(String path) {
        return UNPATHS.contains(path);
    }

    private static final String GOOD_PREFIX = "/mnt/malquoted";

    public static void ensurePathIsSecure(String path) {
        String absolutePath;
        try {
            absolutePath = new File(path).getCanonicalPath();
        } catch (IOException e) {
            throw new SecurityException("Unpath mentioned", e);
        }

        if(!absolutePath.startsWith(GOOD_PREFIX)) {
            throw new SecurityException("path " + absolutePath + " ungood");
        }
    }

    private static final Set<String> UNPATHS = new HashSet<>();

    private static final void rmRf(String path) {
        System.out.println("$ rm -rf " + path);
        UNPATHS.add(path);
    }



}
