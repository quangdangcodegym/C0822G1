package OOP;

public class Rectangle extends Geometric{
    double width, height;
    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, String filled, double width, double height){
        setColor(color);
        setFilled(filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getPerimeter(){
        return (height + width)*2;
    }
    public double getArea(){
        return width*height;
    }

}
