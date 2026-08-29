public class DynamicClient {
    private int state;

    public DynamicClient(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 20) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        DynamicClient obj = new DynamicClient(20);
        System.out.println(obj.dispatch(20));
    }
}
