import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac nhat ax+b = 0");
        System.out.println("Nhap a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap b: ");
        float b = scanner.nextFloat();
        if(a == 0){
            System.out.println("Phuong trinh vo nghiem");
        }else if(b != 0){
            float x = -b/a;
            System.out.println("Nghiem cua phuong trinh la: "+x);
        }else{
            System.out.println("Phuong trinh vo so nghiem");
        }
    }
}