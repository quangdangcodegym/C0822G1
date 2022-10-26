package InterfaceComparatorExtentdsClass;

import Shape.Circle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(5.6,"yellow", false);
        circles[1] = new ComparableCircle(5.6);
        circles[2] = new ComparableCircle();
        for (ComparableCircle c: circles) {
            System.out.println(c);
        }
        Arrays.sort(circles);
        System.out.println();
        for (ComparableCircle a : circles){
            System.out.println(a);
        }
    }
}
