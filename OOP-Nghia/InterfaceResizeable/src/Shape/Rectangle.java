package Shape;

import Resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){};
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*this.length*this.width;
    }
    @Override
    public String toString(){
        return "A Shape.Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of ";
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + this.width*(percent/100);
        this.length = this.length + this.length*(percent/100);
    }
}
