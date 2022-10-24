package com.codegym.BTAbstract;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongtien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongtien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongtien = tenLoaiPhuongtien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongtien() {
        return tenLoaiPhuongtien;
    }

    public void setTenLoaiPhuongtien(String tenLoaiPhuongtien) {
        this.tenLoaiPhuongtien = tenLoaiPhuongtien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public void batDau(){
        System.out.println("Bat Dau");
    }
    public void tangToc(){
        System.out.println("Tang Toc");
    }
    public void dungLai(){
        System.out.println("Dung Lai");
    }
    public abstract double layVanToc();
}
