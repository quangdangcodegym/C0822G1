package geogetry;

import able.Resizeable;
import abstracts.Geogetry;

public class Rectange extends Geogetry implements Resizeable {
    double width;
    double height;
    public Rectange(){

    }
    public Rectange (double width, double height){
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth()*percent);
        setHeight(getHeight()*percent);
    }

    @Override
    public String toString() {
        return "Rectange{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        double area = width*height;
        return area;
    }
}
