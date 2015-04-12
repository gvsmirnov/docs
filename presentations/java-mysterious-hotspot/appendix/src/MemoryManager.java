import java.util.UUID;

public interface MemoryManager {
    UUID id = MetaRegistry.register(MemoryManager.class);

    static String getId() {
        return id.toString();
    }
}
