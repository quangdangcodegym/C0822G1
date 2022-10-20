public class PointClass {
    private float x = 0.0f;
    private float y = 0.0f;

    public PointClass(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        setX(x); setY(y);
    }
    public float[] getXY(){
        float[] XY = {x,y};
        return XY;
    }

    public String toString() {
        String str = "(" + x + ", " + y +")";
        return str;
    }
}

