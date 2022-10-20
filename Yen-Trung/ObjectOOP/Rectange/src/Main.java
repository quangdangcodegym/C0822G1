import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        float height = scanner.nextFloat();
        System.out.print("Nhap chieu rong: ");
        float width = scanner.nextFloat();

        Reactange reactange = new Reactange(width, height);
        reactange.display();
    }
}