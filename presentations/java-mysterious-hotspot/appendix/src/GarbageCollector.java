public interface GarbageCollector extends MemoryManager {
    long initializedAt = MetaRegistry.register(GarbageCollector.class);
}
