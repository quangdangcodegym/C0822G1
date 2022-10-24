package com.codegym.BTAbstract;

public class HangSanXuat {
    private String tenHangSanXuat;
    private String tenQuocGia;

    public HangSanXuat(){}
    public HangSanXuat(String tenHangSanXuat, String tenQuocGia){
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}
