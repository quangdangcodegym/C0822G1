import OOP.Circle;
import OOP.Point2d;
import OOP.Point3d;
import OOP.Rectangle;
import OOP.interfaces.Comparable;

import java.lang.reflect.Array;
import java.util.Arrays;


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

//        Point2d point2d = new Point2d(6, 7);
//        System.out.println(point2d.toString());
//
//        Point3d point3d = new Point3d(9, 5, 11);
//        System.out.println(point3d.toString());
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(2);
        circles[1] = new Circle(12);
        circles[2] = new Circle(4);
        circles[3] = new Circle(37);
        circles[4] = new Circle(23);
        sort(circles);
        System.out.println(Arrays.toString(circles));

    }

    public static void sort(Circle[] circles) {
        for (int i = 0; i < circles.length - 1; i++) {
            for (int j = i + 1; j < circles.length; j++) {
                Comparable circle = (Comparable) circles[i];
                if (circle.compareTo(circles[j]) == 1) {
                    Circle temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }

    }
}