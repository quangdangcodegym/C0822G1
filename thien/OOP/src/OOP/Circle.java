package OOP;

import OOP.interfaces.Comparable;

import java.util.Arrays;

public class Circle extends Geometric implements Comparable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, String filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public void printCircle(){
        System.out.printf("Circle with: %f radius, %f diameter, %f area, %f perimeter, %s", getRadius(), getDiameter(), getArea(), getPerimeter(), getColor());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Radius: " + getRadius();
    }

    @Override
    public int compareTo(Object obj) {
        Circle c1 = (Circle) obj;
        if (this.getRadius() >= c1.getRadius()){
            return 1;
        } else {
            return -1;
        }

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

    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(2);
        circles[1] = new Circle(12);
        circles[2] = new Circle(4);
        circles[3] = new Circle(37);
        circles[4] = new Circle(23);
        sort(circles);
        System.out.println(Arrays.toString(circles));
    }
}
