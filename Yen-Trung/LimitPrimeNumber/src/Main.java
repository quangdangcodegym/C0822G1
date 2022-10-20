
public class Main {
    public static void main(String[] args) {
        System.out.println(2);
        for(int i=2; i<=100; i++){
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    break;
                }else if(j == i-1){
                    System.out.println(i);
                }
            }
        }
    }
}