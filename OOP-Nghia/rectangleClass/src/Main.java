import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double width, height;
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        width = scanner.nextDouble();
        System.out.print("\nNhập chiều rộng hình chữ nhật: ");
        height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật: " + rectangle.display());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
    }
}