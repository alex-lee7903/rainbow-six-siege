public class SecureProvider {
    private int state;

    public SecureProvider(int seed) {
        this.state = seed;
    }

    public int compute(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 28) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SecureProvider obj = new SecureProvider(28);
        System.out.println(obj.compute(28));
    }
}
