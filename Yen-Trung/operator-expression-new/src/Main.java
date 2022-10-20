import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter width:");
        width = scaner.nextFloat();
        System.out.println("Enter height:");
        height = scaner.nextFloat();

        float area;
        area = height * width;
        System.out.println("area: "+area);
    }
}