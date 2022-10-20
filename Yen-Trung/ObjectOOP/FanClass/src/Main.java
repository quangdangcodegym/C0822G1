public class Main {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass(1, 10, "yellow", true);
        FanClass fan2 = new FanClass(2, 5, "blue", false);
        fan1.setToString(fan1, "fan1");
        fan2.setToString(fan2, "fan2");
    }
}