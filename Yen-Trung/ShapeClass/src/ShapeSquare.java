public class ShapeSquare extends ShapeRectange {
    double side ;
    public ShapeSquare(double side, String color, boolean filled){
        super("Square",side, side, color,filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
