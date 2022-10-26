package Shape;

public class Shape {
    private String color = "red";
    private boolean filled = true;
    public Shape(){};
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return this.filled;
    }
    @Override
    public String toString(){
        return "A Shape.Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }

}
