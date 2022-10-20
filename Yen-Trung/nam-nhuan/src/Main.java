import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam: ");

        int year = scanner.nextInt();
        if(year <= 0){
            System.out.println("Nam nhap vao khong hop le");
            return;
        }
        if((year % 4==0 && year % 10 != 0) || (year % 100 ==0 && year % 400 ==0)){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is NO leap year");
        }
    }
}