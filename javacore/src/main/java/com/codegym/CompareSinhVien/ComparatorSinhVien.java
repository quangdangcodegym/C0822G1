package com.codegym.CompareSinhVien;

import java.util.Comparator;

public class ComparatorSinhVien implements Comparator<SinhVien> {
    public ComparatorSinhVien(SinhVien sinhVien1, SinhVien sinhVien2) {
    }

    public ComparatorSinhVien() {
    }

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getMaSinhVien() - o2.getMaSinhVien();
    }
}
