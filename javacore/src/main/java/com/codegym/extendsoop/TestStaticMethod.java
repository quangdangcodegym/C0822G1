package com.codegym.extendsoop;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1, "Nhàn");
        Student s2 = new Student(2, "Hoàng");
        Student s3 = new Student(3, "Nguyên");


        s1.display();
        s2.display();
        s3.display();
    }
}
