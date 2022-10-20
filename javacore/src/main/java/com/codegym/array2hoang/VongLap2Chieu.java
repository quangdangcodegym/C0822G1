package com.codegym.array2hoang;

import java.util.Scanner;

public class VongLap2Chieu {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        countCharInStringView();

    }

    public static void launch() {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("Bài 1. Nhập ma trận");
            System.out.println("Bài 2. In ra ma trận");
            System.out.println("Bài 3. Tính tổng các số chẵn");
            System.out.println("Bài 4. Tính tổng 2 đường chéo chính");
            System.out.println("Bài 5. Tính tổng các số nằm trên đường viền của ma trận");
            System.out.println("Bài 6. In ra tam giác vuông góc trên trái ");
            System.out.println("Bài 7. In ra tam giác vuông góc trên phải ");
            System.out.println("Bài 8. In ra tam giác vuông góc dưới trái ");
            System.out.println("Bài 8. In ra tam giác vuông góc dưới trái và tính tổng");
            System.out.println("Bài 9. In ra tam giác vuông góc dưới phải và tính tổng các số chẵn ");
            System.out.println("Bài 10. Tính tổng giá trị của một cột bất kì ");
            System.out.println("Nhập 0 để thoát ");
            System.out.print("Nhập số: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bài 1. Nhập ma trận");
                    printArrayView();
                    break;
                case 2:
                    System.out.println("Bài 2. In ra ma trận");
                    printArrayView();
                    break;
                case 3:
                    System.out.println("Bài 3. Tính tổng các số chẵn");
                    totalEvenArrayView();
                    break;
                case 4:
                    System.out.println("Bài 4. Tính tổng 2 đường chéo chính");
                    totalDiagonalArray2View();
                    break;
                case 5:
                    System.out.println("Bài 5. Tính tổng các số nằm trên đường viền của ma trận");
                    tongCacGiaTriDuongBienView();
                    break;
                case 6:
                    System.out.println("Bài 6. In ra tam giác vuông góc trên trái ");
                    tamGiacVuongGocTrenTraiView();
                    break;
                case 7:
                    System.out.println("Bài 7. In ra tam giác vuông góc trên phải ");
                    tamGiacVuongGocTrenPhaiView();
                    break;
                case 8:
                    System.out.println("Bài 8. In ra tam giác vuông góc dưới trái và tính tổng");
                    tamGiacVuongGocDuoiTraiView();
                case 9:
                    System.out.println("Bài 9. In ra tam giác vuông góc dưới phải ");
                    tamGiacVuongGocDuoiPhaiView();
                    break;
                case 10:
                    System.out.println("Bài 10. Tính tổng giá trị của một cột bất kì ");
                    tongCacGiaTriCuaMotCot();
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
    private static void countCharInStringView() {
        System.out.println("Nhập chuỗi bạn muốn tìm: ");
        String str = scanner.nextLine();

        String str1 = str.toLowerCase();
        char [] chars = str1.toCharArray();

        boolean isReTryChar = true;
        String cString = "";
        do{
            System.out.println("Nhập kí tự bạn muốn tìm: ");
            cString = scanner.nextLine();
            if (cString.length() > 1 || cString.equals("")) {
                isReTryChar = true;
            }else{
                isReTryChar = false;
            }
        }while (isReTryChar);

        char c = cString.toLowerCase().toCharArray()[0];
        int count = 0;
        for (char item : chars) {
            if (item == c) {
                count++;
            }
        }
        System.out.printf("Số lần xuất hiện của kí tự %s count: %d", cString, count);
    }

    public static void tongCacGiaTriCuaMotCot() {
        System.out.print("Nhập số dòng: ");
        int nRow = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int nCol = scanner.nextInt();
        int array[][] = inputArray1(nRow, nCol);
        printArray(array);
        int numberCol;
        int sum;
        do {
            System.out.printf("Nhập số cột bạn muốn kiểm tra(từ 0 đến %d): ", nCol - 1);
            numberCol = scanner.nextInt();
            sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (numberCol == j) {
                        System.out.print(array[i][j] + " ");
                        sum += array[i][j];
                    }
                }
            }
        } while (numberCol > nCol - 1);

        System.out.println("");
        System.out.printf("Tổng giá trị của cột %d là %d", numberCol, sum);
    }

    public static void tongCacGiaTriDuongBienView() {
        int[][] array = inputArray();
        printArray(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    System.out.print(array[i][j] + " ");
                    sum += array[i][j];
                }
//                if (i != 0 && i != array.length - 1) {
//                    if (j == 0 || j == array.length - 1) {
//                        System.out.print(array[i][j] + " ");
//                        sum += array[i][j];
//                    } else {
//                        array[i][j] = Integer.parseInt("0");
//                        System.out.print(array[i][j] + "0 ");
//                    }
//                }
                if (i != 0 && i != array.length - 1) {
                    if (j == 0 || j == array.length - 1) {
                        System.out.print(array[i][j] + " ");
                        sum += array[i][j];
                    } else {
                        String str = "";
                        str = String.valueOf(array[i][j]);
                        str = "   ";
                        System.out.print(str);
                    }
                }

                if (i == array.length - 1) {
                    System.out.print(array[i][j] + " ");
                    sum += array[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Tổng các giá trị trên đường biên là: " + sum);

    }

    public static void totalDiagonalArray2View() {
        int[][] array = inputArray();
        printArray(array);
        int sum = totalDiagonalArray2(array);
        System.out.println("Tổng của 2 đường chéo là: " + sum);
    }

    public static int totalDiagonalArray2(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                    System.out.printf(arr[i][j] + " ");
                }
                if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                    System.out.printf(arr[i][j] + " ");
                }
            }
        }
        return sum;
    }

    public static void tamGiacVuongGocTrenPhaiView() {
        int[][] arr = inputArray();
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < i) {
                    String str = "";
//                    str = java.lang.String.valueOf((arr[i][j]));
                    str = "   ";
                    System.out.print(str);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void tamGiacVuongGocTrenTraiView() {
        int[][] arr = inputArray();
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void tamGiacVuongGocDuoiPhaiView() {
        int[][] arr = inputArray();
        printArray(arr);
        int sum = 0;
//        // tam giác góc vuông dưới phải
//        //              *
//        //            * *
//        //          * * *
//        //        * * * *
//        //      * * * * *
//        //    * * * * * *
////         00 01 02 03 04 05              05
////                     14 15
////                  23 24 25
////               32 33 34 35
////            41 42 43 44 45
////         50 51 52 53 54 55
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < (arr.length - 1) - i) {
                    String str = "";
//                    str = java.lang.String.valueOf((arr[i][j]));
                    str = "   ";
                    System.out.print(str);
                } else {
                    System.out.print(arr[i][j] + " ");
                    if (arr[i][j] % 2 == 0) {
                        sum += arr[i][j];
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("Tổng số chẵn trong tam giác là: " + sum);
    }

    public static void tamGiacVuongGocDuoiTraiView() {
        int[][] arr = inputArray();
        printArray(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println("");
        }
        System.out.println("Tổng các giá trị trong hình tam giác là: " + sum);
    }

    public static void totalEvenArrayView() {
        totalEvenArray(inputArray());
    }

    public static int totalEvenArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        printArray(array);
        System.out.println("tổng các số chẵn trong mảng 2 chiều là: " + sum);
        return sum;
    }

    public static int[][] inputArray() {
        System.out.print("Nhập số dòng: ");
        int nRow = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int nCol = scanner.nextInt();
        int array[][] = new int[nRow][nCol];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (100 - 10)) + 10;
            }
        }
        return array;
    }

    public static void inputArray1View() {
        System.out.print("Nhập số dòng: ");
        int nRow = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int nCol = scanner.nextInt();
        inputArray1(nRow, nCol);
    }

    public static int[][] inputArray1(int nRow, int nCol) {
        int array[][] = new int[nRow][nCol];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (100 - 10)) + 10;
            }
        }
        return array;
    }

    public static void printArrayView() {
        printArray(inputArray());
    }

    public static String printArray(int array[][]) {
        String strArray = "";
        for (int i = 0; i < array.length; i++) {
            String str = "[";
            for (int j = 0; j < array[i].length; j++) {
                str += array[i][j];
                if (j == array[i].length - 1) {
                    str += "]";
                } else {
                    str += ", ";
                }
            }
            str += "\n";
            strArray += str;
        }
        System.out.println(strArray);
        return strArray;
    }
}