public class ShapeClass {

    private String color;
    private boolean filled;

    private String name;

    public ShapeClass(String name, String color, boolean filled){
        this.name = name;
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayShape(){
        System.out.printf("A %s with color of %s and %s \n",this.name, this.color, this.filled);
    }
}
