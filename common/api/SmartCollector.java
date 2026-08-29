public class StreamRouter {
    private int state;

    public StreamRouter(int seed) {
        this.state = seed;
    }

    public int render(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 86) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        StreamRouter obj = new StreamRouter(86);
        System.out.println(obj.render(86));
    }
}
