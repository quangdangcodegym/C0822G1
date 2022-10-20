import java.util.Scanner;
import java.util.Random;
public class SumColumnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rank matrix: ");
        int rank = scanner.nextInt();
        boolean checkColumn = true;
        do{
            System.out.print("Column target: ");
            int column = scanner.nextInt();
            if(column >= rank || column < 0){
                checkColumn = true;
            }else{
                checkColumn = false;
                sumColumn(column, rank);
            }
        }while (checkColumn);
    }
    public static void sumColumn(int column, int rank){
        int [][] array = new int[rank][rank];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                int rdNumber = (int)Math.floor(Math.random()*(100-50+1)+50);
                array[i][j] = rdNumber;
            }
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++) {
                if(j==array[i].length-1){
                    System.out.print(array[i][j]);
                }else{
                    System.out.print(array[i][j] + ", ");
                }
            }
            System.out.println("");
        }
        int sum= 0;
        for(int i=0; i<array[column].length; i++){
            sum+=array[column][i];
        }
        System.out.println("Total of array is " + sum);
    }
}
