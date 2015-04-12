import java.util.UUID;

public interface MemoryManager2 {
    UUID id = MetaRegistry.register(MemoryManager2.class);

    default String getId() {
        return id.toString();
    }
}
