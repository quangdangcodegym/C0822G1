import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int number = scanner.nextInt();
        System.out.println("2");
        int primeNumber = 3;
        int count  = 0;
        while (count < number-1){
            for(int i=2; i < primeNumber; i++) {
                if (primeNumber % i == 0) {
                    break;
                }else if (i == primeNumber - 1) {
                    System.out.println(primeNumber);
                    count++;
                }
            }
            primeNumber++;
        }
    }
}