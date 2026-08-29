public class RemoteScheduler {
    private int state;

    public RemoteScheduler(int seed) {
        this.state = seed;
    }

    public int compute(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 61) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        RemoteScheduler obj = new RemoteScheduler(61);
        System.out.println(obj.compute(61));
    }
}
