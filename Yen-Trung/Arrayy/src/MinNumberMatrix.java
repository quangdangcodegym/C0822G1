import java.util.Scanner;

public class MinNumberMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int i=0;
        do{
            System.out.print("Nhap number at index " + i + " ");
            int number = scanner.nextInt();
            minNumber(number, i, array);
            i++;
        }while (i<=array.length-1);
        int min = array[0];
        for(int j=0; j< array.length; j++){
            if(array[j] < min){
                min = array[j];
            }
            if(j== array.length-1){
                System.out.print(array[j]);
            }else{
                System.out.print(array[j] + ", ");
            }
        }
        System.out.println("\n"+ min + " is smallest number in array");
    }
    public static void minNumber(int number, int index, int[] array) {
        array[index] = number;
    }
}
