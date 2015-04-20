public interface MemoryManager2 {
    long initializedAt = MetaRegistry.register(MemoryManager2.class);

    default long getInitTime() {
        return initializedAt;
    }
}
