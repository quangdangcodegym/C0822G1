package Shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());

        rectangle = new Rectangle(3.3, 4.4);
        System.out.println(rectangle.toString());

        rectangle = new Rectangle(5.5,6.6, "blue", false);
        System.out.println(rectangle.toString());
    }
}
