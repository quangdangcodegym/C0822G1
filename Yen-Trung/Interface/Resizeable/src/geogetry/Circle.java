package geogetry;

import able.Resizeable;
import abstracts.Geogetry;

public class Circle extends Geogetry implements Resizeable {
    double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*percent);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        double area = radius*radius*Math.PI;
        return area;
    }
}
