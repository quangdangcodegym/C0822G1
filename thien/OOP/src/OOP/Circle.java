package OOP;

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
    public int compareTo(Object obj) {
        Circle c1 = (Circle) obj;
        if (this.getRadius() >= c1.getRadius()){
            return 1;
        } else {
            return -1;
        }

    }
}
