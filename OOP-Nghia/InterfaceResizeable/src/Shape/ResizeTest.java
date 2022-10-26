package Shape;
public class ResizeTest {
    public static void main(String[] args) {
        Shape[] drawing = new Shape[3];
        drawing[0] = new Circle(2);
        drawing[1] = new Rectangle(3, 2);
        drawing[2] = new Square(4);
        System.out.print("pre-Area Circle/ Rectangle/ Square :");
        System.out.println();

        for (Shape area : drawing) {
            if (area instanceof Circle) {
                System.out.println(((Circle) area).getArea());
            }
            if (area instanceof Square) {
                System.out.println(((Square) area).getArea());
            }
            if (area instanceof Rectangle) {
                System.out.println(((Rectangle) area).getArea());
            }
        }
        System.out.println();

        for (Shape area : drawing) {
            double ran = (Math.floor(Math.random() * (100 - 1 + 1)) + 1);
            if (area instanceof Circle) {
                ((Circle) area).resize(ran);
                System.out.println(((Circle) area).getArea());
            }
            if (area instanceof Square) {
                ((Square) area).resize(ran);
                System.out.println(((Square) area).getArea());
            }
            if (area instanceof Rectangle) {
                ((Rectangle) area).resize(ran);
                System.out.println(((Rectangle) area).getArea());
            }
        }
    }
}
