public class SmartMonitor {
    private int state;

    public SmartMonitor(int seed) {
        this.state = seed;
    }

    public int compute(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 3) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        SmartMonitor obj = new SmartMonitor(3);
        System.out.println(obj.compute(3));
    }
}
