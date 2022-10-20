public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        double a = this.a;
        double b = this.b;
        double c = this.c;
        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        return root1;
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        double a = this.a;
        double b = this.b;
        double c = this.c;
        double root2 = (-b +- Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        return root2;
    }
    public void disPlayRoot(){
        double delta = getDiscriminant();
        System.out.printf("PT %sx2 + (%sx) + (%s) = 0 \n", (int)this.a, (int)this.b, (int)this.c);
        if(delta > 0){
            System.out.printf("x1 = %s\nx2 = %s", getRoot1(), getRoot2());
        }else if(delta == 0){
            System.out.printf("x1 = x2 = %s", getRoot1());
        }else{
            System.out.print("PT vo nghiem");
        }
    }
}
