import java.util.UUID;

public class MetaRegistry {
    public static UUID register (Class<?> clazz) {
        System.out.println(clazz.getSimpleName());
        return UUID.randomUUID();
    }

    public static void main(String[] args) {
        System.out.println(GarbageCollector.id);
        System.out.println(GarbageCollector2.id);
    }
}
