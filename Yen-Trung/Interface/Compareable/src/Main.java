import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);
        circles[3] = new ComparableCircle(4.0, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        System.out.println("After-sorted:");

//        Arrays.sort(circles);
//        for (int i=0; i<circles.length-1; i++) {
//            if(circles[i].getRadius() > circles[i+1].getRadius()){
//                ComparableCircle a = circles[i];
//                circles[i] = circles[i+1];
//                circles[i+1] = a;
//            }
//        }
        CircleComparator comparator = new CircleComparator();
        Arrays.sort(circles, comparator);
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}