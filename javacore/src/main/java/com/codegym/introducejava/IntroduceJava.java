package com.codegym.introducejava;

import java.util.Scanner;

public class IntroduceJava {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /**
        // Bài tập kiểm tra năm nhuân
        boolean flag = true;
        do{
            System.out.println("Bạn hãy nhập số năm cần kiểm tra: ");
            int year = Integer.parseInt(scanner.nextLine());
            boolean check = checkLeapYear(year);
            if(check){
                System.out.println(year + " là năm nhuận");
            }else {
                System.out.printf("%d không là năm nhuận",year);
            }
            boolean flagCheck = true;
            do{
                System.out.println("Bạn có muốn tiếp tục kiểm tra không: Y/N");
                String checkContinue = scanner.nextLine();
                if(checkContinue.equals("N")){
                    flag = false;
                    flagCheck = false;
                }else {
                    if (checkContinue.equals("Y")) {
                        flag = true;
                        flagCheck = false;
                    }else{
                        flagCheck = true;
                    }

                }
            }while (flagCheck==true);

        }while (flag==true);

         **/




    }

    public static boolean checkLeapYear(int year){
        if((year%4 == 0)&& (year%100 !=0)){
            return true;
        }else{
            if((year%100==0) && (year%400!=0)){
                return false;
            }else{
                if((year%100==0) && (year%400==0)){
                    return false;
                }else {
                    return false;
                }
            }
        }
    }

    public static int convertUSDToVnd(int numUSD, int rate){
        return rate * numUSD;
    }

}
