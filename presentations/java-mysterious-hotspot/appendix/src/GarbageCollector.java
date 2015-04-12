import java.util.UUID;

public interface GarbageCollector extends MemoryManager {
    UUID id = MetaRegistry.register(GarbageCollector.class);
}
