public class Main {
    public static void main(String[] args) {
        ShapeCircle circle;
        ShapeSquare square;
        circle = new ShapeCircle(1.0, "yellow", true);
        square = new ShapeSquare(5, "blue", false);


        System.out.println(circle.getName()+" Area is "+ circle.getArea());
        System.out.println(circle.getName() +" Perimeter is " + circle.getPerimeter());
        circle.displayShape();

        System.out.println(square.getName()+" Area is "+ square.getArea());
        System.out.println(square.getName() +" Perimeter is " + square.getPerimeter());
        square.displayShape();
    }
}