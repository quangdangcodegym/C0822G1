public class MoveablePoint extends PointClass {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }
    public void setYSpeed(){
        this.ySpeed = ySpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = {xSpeed, ySpeed};
        return speed;
    }
    public MoveablePoint move(){
        float x = getX();
        float y =getY();
        setX(x+=xSpeed);
        setY(y+=ySpeed);
        return this;
    }
    public String toString(){
        String str = "(" + getX() + ", "+ getY() + "), speed="+"("+xSpeed+", "+ySpeed+")";
        return str;
    }
}
