package Shape;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.toString());

        square = new Square(5.5);
        System.out.println(square.toString());

        square = new Square(10.1, "blue", false);
        System.out.println(square.toString());
    }
}
