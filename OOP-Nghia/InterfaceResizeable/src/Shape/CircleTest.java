package Shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5);
        System.out.println(circle);

        circle = new Circle(10, "blue", false);
        System.out.println(circle);
    }
}
