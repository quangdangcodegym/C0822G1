import java.time.LocalDateTime;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        String time = stopWatch.getNowTime();
        float start = Float.parseFloat(stopWatch.getElapsedTime());
        System.out.println("TimeStart: "+time);
        System.out.println("TimeStart: "+start);
        sortNumber();
        float end = Float.parseFloat(stopWatch.getElapsedTime());

        if(end - start < 0){
            System.out.println("TimeHandle: "+(end-start)+60);
        }else{
            System.out.println("TimeHandle: "+(end-start));
        }
    }
    public static void sortNumber(){
        int[] array = new int[100000];
        for(int i=0; i<array.length; i++){
            array[i] = (int)Math.floor((Math.random()*(99-50)+1)+50);
        }
        for(int i=0; i< array.length-1; i++){
            if(array[i] > array[i+1]){
                int a = array[i];
                array[i] = array[i+1];
                array[i+1] = a;
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }
}