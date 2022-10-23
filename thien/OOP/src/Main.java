import OOP.Circle;
import OOP.Point2d;
import OOP.Point3d;
import OOP.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Circle circle1 = new Circle(4, "blue", "red");
//        circle1.setColor("grey");
//        circle1.printCircle();
//
//        Circle circle2 = new Circle(7, "pink", "yes");
//        circle2.printCircle();
//        System.out.println(circle2.getColor());
//
//        Rectangle rec1 = new Rectangle("brown", "yes", 15, 10);
//        System.out.println(rec1.getArea());
//        System.out.println(rec1.getPerimeter());

        Point2d point2d = new Point2d(6, 7);
        System.out.println(point2d.toString());

        Point3d point3d = new Point3d(9, 5, 11);
        System.out.println(point3d.toString());
    }
}