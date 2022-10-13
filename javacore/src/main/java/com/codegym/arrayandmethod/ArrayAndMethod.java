package com.codegym.arrayandmethod;

import java.util.Scanner;

public class ArrayAndMethod {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int [] a = new int[10];

    }
    public static void reverseArrayView(){
        int [] arr = inputArray();
        System.out.println(convertArrayToString(arr));
        reverseArray(arr);
        System.out.println(convertArrayToString(arr));
    }
    public static void reverseArray(int arr[]){
        int mid = arr.length/2;
        for(int i=0;i<mid;i++){
            int temp = arr[i];
            arr[i]  = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    public static void inputArrayView(){
        System.out.println("Nhập số lương phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            int item = scanner.nextInt();
            arr[i] = item;
        }

        System.out.println(convertArrayToString(arr));
    }
    public static int[] inputArray(){
        System.out.println("Nhập số lương phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            int item = scanner.nextInt();
            arr[i] = item;
        }

        return arr;
    }
    public static String convertArrayToString(int arr[]){
        String str = "[";
        for(int i = 0;i<arr.length;i++){
            str +=  arr[i];
            if(i==arr.length-1){
                str += "]";
            }else{
                str += ",";
            }
        }
        return str;
    }
}
