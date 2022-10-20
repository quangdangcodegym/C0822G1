import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean checkContinue = true;
        do{
            System.out.println("Menu: ");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            int input = scanner.nextInt();
            if(input == 4){
                checkContinue = false;
            }

            if(input == 1){
                System.out.println("height");
                int height = scanner.nextInt();
                System.out.println("width");
                int width = scanner.nextInt();
                drawRectange(height, width);
            }
            if(input == 2){
                System.out.println("height: ");
                int width = scanner.nextInt();
                System.out.println("type: ");
                int type = scanner.nextInt();
                drawSquareTrangle(width, type);
            }
            if(input == 3){
                System.out.println("height: ");
                int height = scanner.nextInt();
                drawIsoscelesTriangle(height);
            }
        }while (checkContinue);
    }
    public static void drawRectange(int height, int width){
        for(int i=1; i<=height; i++){
            for(int j=1; j<=width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawSquareTrangle(int height, int type){
        if(type == 1){
            // bottom-left
            for(int i=1; i<= height; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        if(type == 2){
            //top-left
            for(int i=1; i<=height; i++){
                for(int j = height-(i-1); j>=1; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        if(type == 3){
            //bottom-right
            for(int i=1; i<= height; i++) {
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }
                for (int a = 1; a <= i; a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        if(type == 4){
            //bottom-right
            for(int i=1; i<= height; i++) {
                for (int j = height-(i-1); j >= 1; j--) {
                    System.out.print("*");
                }
                for (int j = 1; j <= i-1; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    public static void drawIsoscelesTriangle(int height){
        int width = height*2-1;
        for(int i=1; i<= height; i++){
            for(int j=1; j<=height-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i+(i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}