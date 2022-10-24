package com.codegym.BTAbstract;

public class Test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hang 1", "Viet Nam");
        HangSanXuat h2 = new HangSanXuat("Hang 2", "Canada");
        HangSanXuat h3 = new HangSanXuat("Hang 3", "Nhat Ban");

        PhuongTienDiChuyen p1 = new XeOto(h1,"Xang Dau");
        MayBay p2 = new MayBay(h2,"xang");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println("lay van toc: ");
        System.out.println(p1.layVanToc());
        System.out.println(p2.layVanToc());
        System.out.println(p3.layVanToc());
    }
}
