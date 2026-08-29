public class RemoteSession {
    private int state;

    public RemoteSession(int seed) {
        this.state = seed;
    }

    public int load(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 19) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        RemoteSession obj = new RemoteSession(19);
        System.out.println(obj.load(19));
    }
}
