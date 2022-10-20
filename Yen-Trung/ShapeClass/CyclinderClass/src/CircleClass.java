public class CircleClass {
    double radius;
    String color;
    String name;

    public CircleClass(String name, double radius, String color){
        this.name = name;
        this.radius= radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        double area = Math.pow(radius, 2)*Math.PI;
        return area;
    }
    public String toString(){
        return "name: "+name+" - "+"radius: "+radius + " - "+"color: " + color + " - " + "bottomArea: "+ getArea();
    }
}
