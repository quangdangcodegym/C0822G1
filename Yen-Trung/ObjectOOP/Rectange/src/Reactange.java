public class Reactange {
    float width, height;
    public Reactange(float width, float height){
        this.width = width;
        this.height = height;
    }
    public float getArea(){
        float area = this.width * this.height;
        return area;
    }
    public float getPerimeter(){
        float perimeter = (this.width + this.height)*2;
        return perimeter;
    }
    public void display(){
        System.out.printf("S: %s x %s = %s\n", width, height, getArea());
        System.out.printf("P: (%s + %s) x 2 = %s", width, height,getPerimeter());
    }
}
