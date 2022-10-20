package com.codegym.accessmodifier;

import com.codegym.utils.Helper;

class Student {
    int rollno = 0;
    String name;
    static String college = "Codeygym";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public Student (String name){
        this.name = name ;
        this.rollno = ++Helper.count;
    }
    public Student() {

    }
    @Override
    public String toString() {
        return this.rollno + " name: " + this.name + " college: " +
                Student.college + " Count: " + Helper.count;
    }

    public static void main(String[] args) {
        Student s1 = new Student("bbb NGHIA CODEER...........");
        System.out.println(s1.toString());


        Student s2 = new Student("yyy");
        System.out.println(s2.toString());

        System.out.println(s1.toString());

    }
}
