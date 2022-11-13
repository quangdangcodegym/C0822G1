package com.codegym.demo13_11_22;

import java.util.Scanner;

public class Bien {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();
        isLeapYear(year);
//        isLeapYearS(year);
    }
    private static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year%100 == 0){
                if (year%400 == 0)
                    return true;
            }else {
                return true;
            }
        }
        return false;
    }
//    private static boolean isLeapYearS(int year){
//        boolean isDivisbleBy4 = year%4 ==0;
//        if (isDivisbleBy4){
//            boolean isDivisbleBy100 = year%100 ==0;
//            if (isDivisbleBy100){
//                boolean isDivisbleBy400 = year%400 ==0;
//                if (isDivisbleBy400)
//                    return true;
//            }else {
//                return true;
//            }
//        }
//        return false;
//    }
}
