package com.codegym.sort;

import java.util.Comparator;

public class BubleSort {
    public static void BubbleSort(int[] arr){
        int temp,i,j;
        for (i=0;i<arr.length-1;i++){
            for (j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void BubbleSort(Object[] arr, Comparator<Object> comparator){
        Object temp = null;
        int i,j;
        for (i=0;i<arr.length-1;i++){
            for (j=0;j<arr.length-1-i;j++){
                //arr[j]<arr[j+1]
                if (comparator.compare(arr[j], arr[j+1])==-1){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
