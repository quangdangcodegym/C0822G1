
import java.util.Scanner;
public class CountStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student length: ");
        int student = Integer.parseInt(scanner.nextLine());

        int i=0;
        float[] markArray = new float[student];
        String[] studentArray = new String[student];

        do{
            System.out.print("Fullname: ");
            String fullName = scanner.nextLine();
            boolean checkMark = true;
            do{
                System.out.print("mark: ");
                float mark = Float.parseFloat(scanner.nextLine());
                if(mark < 0 || mark > 10){
                    checkMark = true;
                }else{
                    countStudent(fullName, studentArray, mark, markArray, i);
                    checkMark = false;
                }
            }while (checkMark);
            i++;
        }while (i<=markArray.length-1);
        System.out.printf("%-20s%-20s%-20s", "id", "fullname", "mark");
        System.out.println("");
        int stt = 1;
        for(int a=0; a<markArray.length; a++){
            if(markArray[a]>=5){
                System.out.printf("%-20s%-20s%-20s",stt , studentArray[a], markArray[a]);
                System.out.println("");
                stt++;
            }
        }
    }
    public static void countStudent(String fullName, String[] studentArray, float mark, float[] markArray, int index){
        studentArray[index] = fullName;
        markArray[index] = mark;
    }
}
