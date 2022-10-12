package com.codegym.introducejava;

import java.util.Scanner;

public class IntroduceJava {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
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
            System.out.println("Bạn có muốn tiếp tục kiểm tra không: Y/N");
            String checkContinue = scanner.nextLine();
            if(checkContinue=="N"){
                flag = false;
            }else{
                if(checkContinue=="Y"){
                    flag = true;
                }
            }
        }while (flag==true);

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
}
