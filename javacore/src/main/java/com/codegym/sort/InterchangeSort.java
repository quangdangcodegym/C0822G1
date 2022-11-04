package com.codegym.sort;

import java.util.Comparator;

public class InterchangeSort {
    public static void interchangeSort(Object[] arr, Comparator<Object> comparator){
        Object temp = null;
        int i,j;
        for (i=0;i<arr.length-1;i++){
            for (j=i+1;j<arr.length;j++){
                //arr[i]<arr[j]
                if (comparator.compare(arr[i],arr[j])==-1){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
