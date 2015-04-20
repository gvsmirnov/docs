public interface MemoryManager {
    long initializedAt = MetaRegistry.register(MemoryManager.class);

    static long getInitTime() {
        return initializedAt;
    }
}
