import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap USD :");
        int number = scanner.nextInt();
        int result = number*23000;
        System.out.printf("%s USD= %s VND", number, result);
    }
}