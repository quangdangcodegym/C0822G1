package com.codegym.sort;

import java.util.Comparator;

public class SelectionSort {
    public void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionSort(Object [] arr, Comparator<Object> comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //if (arr[j] < arr[minIndex])
                if (comparator.compare(arr[j], arr[minIndex])==-1) {
                    minIndex = j;
                }
            }
            Object temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


}
