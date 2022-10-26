package Shape;

public class Square extends Rectangle {
    public Square(){};
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side);
        setColor(color);
        setFilled(filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public double getArea() {
        return this.getSide()*this.getSide();
    }

    @Override
    public String toString(){
        return  "A Shape.Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        super.resize(percent);
    }
}
