package OOP;

public class TestCircle {
    private double radius = 1.0;
    private String color = "red";
    public TestCircle(){

    }
    public TestCircle(double radius){
        this.radius = radius;
    }

    private double getRadius() {
        return this.radius;
    }
    private double getArea(){
        return this.radius*this.radius*3.14;
    }

    public static void main(String[] args) {
        TestCircle circle = new TestCircle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
