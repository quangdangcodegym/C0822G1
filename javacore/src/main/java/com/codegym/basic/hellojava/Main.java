package com.codegym.basic.hellojava;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /**
        System.out.println("Hello world!");

        long a  = 9l;
        float b = 9.9f;
        int c  =5;

        Integer d = 10;

        String item = "10";
        int e = Integer.parseInt(item);

       int a = 5;
       int b = ++a - a++*2;
        System.out.println("a: " + a);
        System.out.println("b:" + b);
        sumNInteger(1000);
        System.out.println("Tong cua N so chan: " + sumEvenNInteger(1000));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số để kiểm tra phải so nguyên tố không: ");
        int number = scanner.nextInt();
        if(checkPrimiterNumber(number)){
            System.out.printf("Só %s là số nguyên tố", number);
        }else{
            System.out.printf("Só %s không phải số nguyên tố", number);
        }
         **/

        /** Bài Menu chưa tối ưu kiểm tra đúng sai
        boolean flagReTry = true;
        do{
            System.out.println("Bạn muốn chọn chức năng nào trong bài số nguyên tố");
            System.out.println("Bài 1: Hiển thị n số nguyên tố đầu tiên (Nhập số 1)");
            System.out.println("Bài 2: Hiển thị các số nguyên tố nhỏ hơn n (Nhập số 2)");
            int action = Integer.parseInt(scanner.nextLine());
            switch (action){
                case 1:
                    printPrimiterView();
                    break;
                case 2:
                    printPrimiterLessThanNumberView();
                    break;
            }
            System.out.println("Bạn có muốn tiếp tục hay không. Nhập Y/N");
            String actionContinue = scanner.nextLine();
            switch (actionContinue){
                case "Y":
                    flagReTry = true;
                    break;
                case "N":
                    flagReTry = false;
                    break;
            }
        }while (flagReTry);
    **/

        /** Bài Menu đã kiểm tra đúng sai Y/N
        boolean flagReTry = true;
        do{
            System.out.println("Bạn muốn chọn chức năng nào trong bài số nguyên tố");
            System.out.println("Bài 1: Hiển thị n số nguyên tố đầu tiên (Nhập số 1)");
            System.out.println("Bài 2: Hiển thị các số nguyên tố nhỏ hơn n (Nhập số 2)");
            int action = Integer.parseInt(scanner.nextLine());
            switch (action){
                case 1:
                    printPrimiterView();
                    break;
                case 2:
                    printPrimiterLessThanNumberView();
                    break;
            }
            boolean flagReTryContinue = true;
            do{
                System.out.println("Bạn có muốn tiếp tục hay không. Nhập Y/N");
                String actionContinue = scanner.nextLine();
                switch (actionContinue){
                    case "Y":
                        flagReTry = true;
                        flagReTryContinue = false;
                        break;
                    case "N":
                        flagReTry = false;
                        flagReTryContinue = false;
                        break;
                    default:
                        flagReTryContinue = true;
                        break;
                }
            }while (flagReTryContinue==true);

        }while (flagReTry);

         **/


        boolean flagReTry = true;
        do{
            System.out.println("Bạn muốn chọn chức năng nào trong bài số nguyên tố");
            System.out.println("Bài 1: Hiển thị n số nguyên tố đầu tiên (Nhập số 1)");
            System.out.println("Bài 2: Hiển thị các số nguyên tố nhỏ hơn n (Nhập số 2)");
            int action = Integer.parseInt(scanner.nextLine());
            switch (action){
                case 1:
                    printPrimiterView();
                    break;
                case 2:
                    printPrimiterLessThanNumberView();
                    break;
            }
//            flagReTry = isReTryYesNoCountinue();

        }while (isReTryYesNoCountinue());
    }

    private static boolean isReTryYesNoCountinue() {
        boolean flagReTryContinue = true;
        do{
            System.out.println("Bạn có muốn tiếp tục hay không. Nhập Y/N");
            String actionContinue = scanner.nextLine();
            switch (actionContinue){
                case "Y":
                    flagReTryContinue = false;
                    break;
                case "N":
                    flagReTryContinue = false;
                    break;
                default:
                    flagReTryContinue = true;
                    break;
            }
        }while (flagReTryContinue==true);
        return flagReTryContinue;

    }


    public static void printPrimiterLessThanNumberView() {
        System.out.println("Bạn muốn tìm các số nguyên tố nhỏ hơn bao nhiêu? Vui lòng nhập!");
        int sNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(printPrimiterLessThanNumber(sNumber));
    }
    public static String printPrimiterLessThanNumber(int sNumber){
        int i = sNumber-1;
        String str = "";
        while (i>=2){
            boolean checkPrimiter = checkPrimiterNumber(i);
            if(checkPrimiter==true){
                str += i;
            }
            i--;
        }
        return str;
    }
    public static void printPrimiterView(){
        System.out.println("Nhập số lượng số nguyên tố bạn muốn tìm: ");
        int nSize = Integer.parseInt(scanner.nextLine());

        System.out.println(printPrimiter(nSize));
    }
    public static String printPrimiter(int nSize){
        String str = "";
        int count = 0;
        int i = 2;
        while (count<=nSize){
            boolean checkPrimiter = checkPrimiterNumber(i);
            if(checkPrimiter==true){
                count++;
                str += i + " ";
            }
            i++;
        }
        return str;
    }


    private static boolean checkPrimiterNumber(int number) {
        int i = 2;
        while(i<number){
            if(number%i == 0){
                return false;
            }
            i++;
        }
        return true;

    }

    private static int sumEvenNInteger(int sSize) {
        int sum = 0;
        for(int i=1;i<sSize;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void sumNInteger(int sSize){
        int sum = 0;
        for(int i=1;i<sSize;i++){
            sum+=i;
        }
        System.out.println("Tổng là: "+ sum);
    }
}