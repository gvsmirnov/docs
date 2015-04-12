import java.util.UUID;

public interface GarbageCollector2 extends MemoryManager2 {
    UUID id = MetaRegistry.register(GarbageCollector2.class);
}
