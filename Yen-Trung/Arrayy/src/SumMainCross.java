import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class SumMainCross {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          boolean checkContinue = true;
          do{
              System.out.printf("Rank: ");
              int rank = Integer.parseInt(scanner.nextLine());

              int[][] array = new int[rank][rank];
              int sum = 0;
              for(int i=0; i<array.length; i++){
                  for(int j=0; j<array[i].length; j++){
                      array[i][j] = (int)Math.floor(Math.random()*(99-50+1)+50);
                  }
              }

              for(int i=0; i<array.length; i++){
                  sum+=array[i][i];
              }

              for(int i=0; i<array.length; i++){
                  for(int j=0; j<array[i].length; j++){
                      if(j == array[i].length-1){
                          System.out.print(array[i][j]);
                      }else{
                          System.out.print(array[i][j] + ", ");
                      }
                  }
                  System.out.println("");
              }
              System.out.println("Sum of main cross is "+ sum);
              boolean checkYesNo = true;
              do{
                  System.out.println("Do you want to continue ? Y/N");
                  String inputContinue = scanner.nextLine();
                  if(inputContinue.equals("Y") || inputContinue.equals("y")){
                      checkContinue = true;
                      checkYesNo = false;
                  }else if(inputContinue.equals("N") || inputContinue.equals("n")){
                      checkContinue = false;
                      checkYesNo = false;
                  }
              }while (checkYesNo);
          }while (checkContinue);
    }
}
