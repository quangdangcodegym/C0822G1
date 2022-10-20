import java.util.Scanner;
public class MergArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap length array1: ");
        int array1Length = scanner.nextInt();

        System.out.println("Nhap length array2: ");
        int array2Length = scanner.nextInt();

        int[] array1 = new int[array1Length];
        int i =0;
        int a=0;
        do{
            System.out.println("Nhap number for array1 index" + " " + i + ": ");
            int number = scanner.nextInt();
            array1[i] = number;
            i++;
        }while (i<=array1Length-1);

        for(int j=0; j<array1.length; j++){
            if(j==array1.length-1){
                System.out.print(array1[j]);
            }else{
                System.out.print(array1[j]+ ", ");
            }
        }

        System.out.println("");

        int[] array2 = new int[array2Length];
        do{
            System.out.println("Nhap number for array2 index" + " " + a + ": ");
            int number = scanner.nextInt();
            array2[a] = number;
            a++;
        }while (a<=array2Length-1);

        for(int j=0; j<array2.length; j++){
            if(j==array2.length-1){
                System.out.print(array2[j]);
            }else{
                System.out.print(array2[j]+ ", ");
            }
        }
        int[] arrayMerg = new int[array1Length+array2Length];
        for(int e=0; e<array1.length; e++){
            for(int q=0; q<array1.length; q++){
                arrayMerg[e] = array1[e];
            }
            for(int r=0; r<array2.length; r++){
                arrayMerg[r+array1.length] = array2[r];
            }
        }
        System.out.println("");
        for(int v=0; v<arrayMerg.length; v++){
            if(v == arrayMerg.length-1){
                System.out.print(arrayMerg[v]);
            }else{
                System.out.print(arrayMerg[v] + ", ");
            }
        }
    }
}
