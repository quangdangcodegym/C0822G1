public class Point3DClass extends Point2DClass {
    float z =0.0f;
    public Point3DClass(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x); setY(y); setZ(z);
    }
    public float[] getXYZ(){
        float[] XYZ = {getX(), getY(), z};
        return XYZ;
    }

    @Override
    public String toString() {
        String str = "(" + getX() + ", " + getY() + ", " + getZ() +")";
        return str;
    }
}
