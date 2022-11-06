package com.codegym.readandwritefile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nhàn", "Huế"));
        students.add(new Student(2, "Hoàng", "Huế"));
        students.add(new Student(3, "Nghĩa", "Huế"));
        students.add(new Student(4, "Dũng", "Huế"));
        students.add(new Student(5, "Trung", "Huế"));
        students.add(new Student(5, "Yên", "Huế"));
        students.add(new Student(5, "Thiện", "Huế"));
        students.add(new Student(5, "Nguyên", "Huế"));
        students.add(new Student(5, "Cường", "Huế"));
        writeToFile("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
