package Shape;

import Resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0f;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
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
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return "A Shape.Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius*(percent/100);
    }

}
