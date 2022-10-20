public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0, "yellow");
        System.out.printf("Circle %s: radius: %s - color %s\n", circle1.colorLength, circle1.getRadius(), circle1.getColor());
        Circle circle2 = new Circle(4.0, "blue");
        System.out.printf("Circle %s: radius: %s - color %s\n", circle2.colorLength, circle2.getRadius(), circle2.getColor());
    }
}