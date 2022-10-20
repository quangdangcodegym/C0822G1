public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){

    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled){
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        System.out.println("radius: "+getRadius());
        if(getRadius() >= o.getRadius()){
            return 1;
        }else{
            return -1;
        }
    }

}
