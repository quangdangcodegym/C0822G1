package com.codegym.CompareSinhVien;

import java.util.Arrays;

public class Test {
    public static int[] reverse (int[] x ){
        int [] rs = new int[x.length];
        int index = 0;
        for (int i = x.length -1; i >=0;i--){
            rs[index] = x[i];
            index++;
        }
        return rs;
    }
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien(456,"Nhat Hoang","C08",5);
        SinhVien sinhVien1 = new SinhVien(123,"Hoang Tran","C07",8);
        SinhVien sinhVien2 = new SinhVien(333,"Dam Le","C09",3);
        System.out.println(sinhVien2.compareTo(sinhVien));

        SinhVien[] av = new SinhVien[]{sinhVien,sinhVien1,sinhVien2};
        System.out.println(Arrays.toString(av));
        Arrays.sort(av);
        System.out.println(Arrays.toString(av));

        Arrays.sort(av);
        System.out.println(Arrays.toString(av));


    }

}
