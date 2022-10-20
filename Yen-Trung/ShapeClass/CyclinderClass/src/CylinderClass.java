public class CylinderClass extends CircleClass {
    double height;
    String name;
    public CylinderClass(double radius, double height, String name, String color){
        super(name, radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        double volume = super.getArea()*height;
        return volume;
    }
    public String toString(){
        String str = super.toString() +" - "+ "volume: " + getVolume();
        return str;
    }
}
