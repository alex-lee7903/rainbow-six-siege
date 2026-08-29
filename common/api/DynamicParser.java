public class LiteMonitor {
    private int state;

    public LiteMonitor(int seed) {
        this.state = seed;
    }

    public int build(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 43) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        LiteMonitor obj = new LiteMonitor(43);
        System.out.println(obj.build(43));
    }
}
