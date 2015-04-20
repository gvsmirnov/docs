public class MetaRegistry {
    public static long register (Class<?> clazz) {
        System.out.println("Initialized: " + clazz.getSimpleName());
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        System.out.println(GarbageCollector .initializedAt);
        System.out.println(GarbageCollector2.initializedAt);
    }
}
