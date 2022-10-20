import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap number: ");
        int number = scanner.nextInt();
        int max = 100;
        int min = 1;
        int[] arrNumberClone = {1,2,3,4,5,6,7,0};
        int[] arrayNumber = arrNumberClone.clone();
        for(int i=0; i<arrayNumber.length-1; i++){
            if(number == arrayNumber[i]){
                for(int j=i; j < arrayNumber.length-1; j++){
                    arrayNumber[j] = arrayNumber[j+1];
                }
                break;
            }
        }
        for(int i=0; i<arrayNumber.length; i++){
            if(i == arrayNumber.length - 1){
                System.out.print(arrayNumber[i]);
            }else{
                System.out.print(arrayNumber[i] + " " +",");
            }
        }

    }
}