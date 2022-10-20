public class TriagleClass extends ShapeClass {
    public TriagleClass(double a, double b, double c){
        super(a, b, c);
    }
    public double getPerimeter(){
        double Per = a + b + c;
        return Per;
    };
    public double getArea(){
        double P = getPerimeter()/2;
        double area = Math.sqrt(P*(P-a)*(P-b)*(P-c));
        return area;
    }

    @Override
    public String toString() {
        String str = super.toString()+" - "+"Per: "+getPerimeter() + " - "+"Area: "+getArea();
        return str;
    }
}
