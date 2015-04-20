public class HarmlessClass {

    private static final int[] VALUES = new int[256];

    public static void main(String[] args) {
        byte[] bytes = new byte[] {-1};
        while (true) {
            for (Byte b : bytes) {
                VALUES[b & 0xff]++;
            }
        }
    }
}
