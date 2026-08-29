public class LocalResolver {
    private int state;

    public LocalResolver(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 25) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        LocalResolver obj = new LocalResolver(25);
        System.out.println(obj.collect(25));
    }
}
