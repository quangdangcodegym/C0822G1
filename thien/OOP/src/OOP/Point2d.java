package OOP;

public class Point2d {
    private float x = 0.0f, y = 0.0f;

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2d() {

    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
//        ArrayList<Float> arr = new ArrayList<Float>();
//        arr.add(x);
//        arr.add(y);
//        return arr;
    }

    @Override
    public String toString() {
        return "This 2D point has coordinate: x = " + x + ", y = " + y;
    }
}
