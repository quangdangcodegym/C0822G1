package com.codegym.arrayandmethod;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndMethod {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8,3};


        int [] arrNew2 = removeElementFromArray(arr, 4);
        System.out.println(convertArrayToString(arrNew2));
    }

    private static int [] removeElementFromArray(int[] arr, int index) {
        int[] arrNew2 = Arrays.copyOf(arr, arr.length-1);
        if (index < arr.length - 1 && index >= 0) {
            for (int i = 0; i < arrNew2.length; i++){
                if (i >= index){
                    arrNew2[i] = arr[i+1];
                }
            }
        }
        return arrNew2;
    }

    public static void addElementToArray(int arr[],int index, int value){
        int [] arrNew = Arrays.copyOf(arr, arr.length + 1);
        for (int i = 0; i < arrNew.length; i++) {
            if (i == index) {
                arrNew[i] = value;
            }
            if (i > index) {
                arrNew[i] = arr[i - 1];
            }
        }
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
