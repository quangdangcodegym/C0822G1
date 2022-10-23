import java.util.Arrays;

public class Point2D {
    protected float x;
    protected float y;
    public Point2D(){};
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY() {
        return this.y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = {this.x, this.y};
        return arr;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
        float[] arr = {this.x, this.y};
    }
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
class Point3D extends Point2D {
    protected float z;
    public Point3D(){};
    public Point3D(float x, float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYX(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr = {this.x, this.y, this.z};
        return arr;
    }
    public String toString(){
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }
}

