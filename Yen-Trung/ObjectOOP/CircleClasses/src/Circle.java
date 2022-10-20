public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public static int colorLength;
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
        colorLength++;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
