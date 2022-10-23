package com.codegym.Point2DAndPoint3D;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float z){
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.getX();
        this.getY();
        this.z = z;
    }
    public float[] getXYZ(){
        float[]arr = {getX(), getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}'+"\n" + super.toString();
    }
}