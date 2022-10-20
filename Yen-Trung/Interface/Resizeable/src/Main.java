import abstracts.Geogetry;
import geogetry.Circle;
import geogetry.Rectange;
import geogetry.Square;

public class Main {
    public static void main(String[] args) {
        Geogetry[] objs = {new Circle(5), new Rectange(100,500), new Square(250)};

        Circle circle = (Circle) objs[0];
        Rectange rectange = (Rectange) objs[1];
        Square square = (Square) objs[2];


        int[] resizes = {100, 400, 500};
        circle.resize(resizes[0]);
        rectange.resize(resizes[1]);
        square.resize(resizes[2]);

        for(int i=0; i<objs.length; i++){
            System.out.print(objs[i] + " - ");
            System.out.println("Area: "+ objs[i].getArea());
        }


    }
}