package com.codegym.hellojava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        long a  = 9l;
//        float b = 9.9f;
//        int c  =5;
//
//        Integer d = 10;
//
//        String item = "10";
//        int e = Integer.parseInt(item);

//       int a = 5;
//       int b = ++a - a++*2;
//        System.out.println("a: " + a);
//        System.out.println("b:" + b);
//        sumNInteger(1000);
//        System.out.println("Tong cua N so chan: " + sumEvenNInteger(1000));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số để kiểm tra phải so nguyên tố không: ");
        int number = scanner.nextInt();
//        System.out.println("So nay la so nguyen to"+ checkPrimiterNumber(13));
        if(checkPrimiterNumber(number)){
            System.out.printf("Só %s là số nguyên tố", number);
        }else{
            System.out.printf("Só %s không phải số nguyên tố", number);
        }



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