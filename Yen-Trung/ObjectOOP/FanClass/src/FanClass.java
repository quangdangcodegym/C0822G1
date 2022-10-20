
public class FanClass {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setStatus(boolean on){
        this.on = on;
    }
    public boolean getStatus(){
        return this.on;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public FanClass(int speed, int radius, String color, boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color =color;
        this.on = on;
    }

    public void setToString(FanClass fan, String name){
        if(fan.on){
            System.out.printf("%s: speed: %s - color: %s - radius: %s - fan is on\n",name, fan.speed, fan.color, fan.radius);
        }else{
            System.out.printf("%s : color: %s - radius: %s - fan is off\n", name, fan.color, fan.radius);
        }
    }



}
