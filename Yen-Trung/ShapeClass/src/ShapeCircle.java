public class ShapeCircle extends ShapeClass {
    double radius;
    public ShapeCircle(double radius, String color, boolean filled){
        super("Circle", color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
}
