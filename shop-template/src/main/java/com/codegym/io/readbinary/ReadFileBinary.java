package com.codegym.io.readbinary;

import java.io.*;

public class ReadFileJSON {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\shop-template\\data\\products.json");
//        FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\shop-template\\data\\products.json");

//        String  str = "";
//
//        char[] lines = new char[10];
//        while (fileReader.read(lines)!=-1) {
//            str += String.copyValueOf(lines);
//        }
//        System.out.println(str);

        String  str = "";

        int eachChar;
        while ((eachChar = fileReader.read())!=-1) {
//            System.out.println((char) eachChar);
            str += (char) eachChar;
        }
        System.out.println(str);
    }
}
