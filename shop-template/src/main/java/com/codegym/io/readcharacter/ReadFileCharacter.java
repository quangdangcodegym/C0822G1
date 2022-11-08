package com.codegym.io.readcharacter;

import java.io.*;
import java.util.Arrays;

public class ReadFileCharacter {
    public static void main(String[] args) throws IOException {

//        readFileToString();


        FileReader fileReader = new FileReader("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\shop-template\\data\\product.txt");
//        String str = "";
//        int num = -1;
//        while ((num = fileReader.read()) != -1) {
//            char i = (char) num;
//            str += i;
//        }
//        System.out.println(str);
        char [] s = new char[5];
        fileReader.read(s);
        System.out.println(Arrays.toString(s));

        fileReader.read(s);
        System.out.println(Arrays.toString(s));

        fileReader.read(s);
        System.out.println(Arrays.toString(s));

    }

    public static String readFileToString() throws IOException {

        FileReader fileReader = new
                FileReader("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\shop-template\\data\\products.json");
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
        return str;
    }
}
