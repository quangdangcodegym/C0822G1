public class ShapeClass {
    private String name;
    double a;
    double b;
    double c;

    public ShapeClass(double a, double b, double c){
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return "ShapeClass{" +
                "name='" + name + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
