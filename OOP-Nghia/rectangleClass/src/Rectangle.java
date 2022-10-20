public class Rectangle {
    double width;
    double height;
    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double setWidth(double width){
        this.width = width;
        return this.width;
    }
    public double setHeight(double height){
        this.height = height;
        return this.height;
    }
    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public double setArea(double width, double height){
        this.width = width;
        this.height = height;
        return this.width*this.height;
    }
    public double setPerimeter(double width, double height){
        this.width = width;
        this.height = height;
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle {width = "+this.width+", height = "+this.height+"}";
    }
}
