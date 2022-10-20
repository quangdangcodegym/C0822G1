package geogetry;

import able.Colorable;

public class Square extends Rectange implements Colorable {
    public Square(){

    }
    public Square(double size){
        super(size, size);
    }
    public String howToColor() {
        return "Color all four sides";
    }
    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
