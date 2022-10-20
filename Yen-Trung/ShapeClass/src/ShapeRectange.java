public class ShapeRectange extends ShapeClass {
    double width;
    double height;
    String name = "Rectange";
    public ShapeRectange(String name, double width, double height, String color, boolean filled){
        super(name, color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
}
