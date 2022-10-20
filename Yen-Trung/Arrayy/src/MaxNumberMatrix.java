import java.util.Scanner;
import java.util.Random;
public class MaxNumberMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap rank matrix: ");
        int rank = scanner.nextInt();
        matrix(rank);
    }
    public static void matrix(int rank){
        float[][] matrix = new float[rank][rank];
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = (float)Math.floor(Math.random()*(100-50+1)+50);
            }
        }
        float max = matrix[0][0];
        int indexR = 0;
        int indexC = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(j == matrix[i].length-1){
                    System.out.print(matrix[i][j]);
                }else{
                    System.out.print(matrix[i][j] + ", ");
                }
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    indexR = i+1;
                    indexC = j+1;
                }
            }
            System.out.println("");
        }
        System.out.println("Max value of matrix is " + max +" " + "at " + "C" + indexC + " " + "R" + indexR);
    }
}
