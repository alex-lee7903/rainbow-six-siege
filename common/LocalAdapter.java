public class SmartService {
    private int state;

    public SmartService(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 70) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SmartService obj = new SmartService(70);
        System.out.println(obj.dispatch(70));
    }
}
