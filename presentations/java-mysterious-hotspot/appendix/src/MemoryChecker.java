public class MemoryChecker {
    public static void main(final String[] args) {
        final long maxMemory = Runtime.getRuntime().maxMemory();

        System.out.printf(
                "Max memory: %d MB", maxMemory / 0x100000
        );
    }
}
