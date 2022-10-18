package com.codegym.array2;

import java.util.Scanner;

public class Array2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int b[][] = inputArray2();
        System.out.println(printArray2(b));
        printTriangleLeftArray2(b);
    }

    public static int[][] inputArray2() {
        System.out.println("Nhập số cột: ");
        int nCol = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng: ");
        int nRow = Integer.parseInt(scanner.nextLine());
        int arr[][] = new int[nRow][nCol];
        for(int i=0;i< arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Nhập cho a[%s][%s]: ", i, j);
//                int value = Integer.parseInt(scanner.nextLine());
                // 1-100
                int value = (int) (Math.random()*(100-1)) + 1;
                arr[i][j] = value;
            }
        }
        return arr;
    }
    // [2,2,4]
    // [4,5,7]

    public static String printArray2(int arr[][]){
        String strArr = "";
        for(int i=0;i< arr.length;i++){
            String str = "[";
            for (int j = 0; j < arr[i].length; j++) {
                str += arr[i][j];
                if(j == arr[i].length-1){
                    str += "]";
                }else{
                    str += ",";
                }
            }
            str += "\n";
            strArr += str;
        }
        return strArr;
    }

    public static int totalEvenArray2(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    // Tinh tong cac gia tri tren 2 duong cheo chinh
    public static int totalDiagonalArray2(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                if(i==j){
//                    sum+= arr[i][j];
//                }
//                if (i + j == arr.length - 1) {
//                    sum+=arr[i][j];
//                }
                if(i==j || i + j == arr.length - 1){
                    sum+= arr[i][j];
                    System.out.printf(arr[i][j] +" ");
                }
            }
        }
        return sum;
    }

    /**
     Bài -3: Nhập ma trận
     Bài -2: In ra ma trận
     Bài -1: Tính tổng các số chẵn trong ma trận
     Bài 0: Tính tổng các số trên đường chéo chính
     Bài 1: In ra tam giác trái
     Bài 2: In ra tam giác phải và tính tổng
     Bài 3: In ra tam giác trái ngược và tính tổng các số chẵn
     Bài 5: In ra các số nằm trên đường viền của ma trận
     **Bài 6: Làm menu tổng hợp các bài tập trên (Phải làm)
     */


    public static void printTriangleLeftArray2(int arr[][]) {
        for (int c = 0; c < arr.length;c++){
            for (int r = 0; r < c+1;r++){
                System.out.print(arr[c][r]+ " ");
            }
            System.out.println("");
        }
    }
    public static void printTriangleRightArray2(int arr[][]) {

    }


}
