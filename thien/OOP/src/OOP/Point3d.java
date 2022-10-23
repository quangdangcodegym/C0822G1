package OOP;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();
        return arr;
    }

    public void printCoordinate() {
        float[] arr = getXYZ();
        System.out.printf("This 3D point has coordinate: x = %.2f, y = %.2f, z = %.2f", arr[0], arr[1], arr[2]);
        System.out.println();
    }

    public Point3d() {

    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        float[] arr = getXYZ();

        return "This 3D point has coordinate: x = " + arr[0]
                + ", y = " + arr[1]
                + ", z = " + arr[2];
    }
}
