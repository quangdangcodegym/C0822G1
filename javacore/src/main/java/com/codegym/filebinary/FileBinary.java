package com.codegym.filebinary;

import java.io.*;

public class FileBinary {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\javacore\\data\\objectstream.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);



    }

    public static void FileReadDataStream() throws IOException {
        InputStream inputStream = new FileInputStream("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\javacore\\data\\datastream.txt");
//        OutputStream outputStream = new FileOutputStream("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\javacore\\data\\datastream.txt");


        DataInputStream dataInputStream = new DataInputStream(inputStream);
//        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

//        int num = 8;
//        dataOutputStream.writeInt(num);
//        dataOutputStream.writeDouble(10.0);

        System.out.println(dataInputStream.readInt());
    }
    public static void FileReadByte() throws IOException {
        FileInputStream fileInputStream = new
                FileInputStream("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\javacore\\data\\datastream.txt");


        FileOutputStream fileOutputStream = new
                FileOutputStream("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\javacore\\data\\giohang.PNG");
        int byteItem = -1;
        while ((byteItem= fileInputStream.read()) != -1) {
            fileOutputStream.write(byteItem);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void FileReadBufferByte() throws IOException {
        FileInputStream fileInputStream = new
                FileInputStream("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\javacore\\data\\datastream.txt");


        FileOutputStream fileOutputStream = new
                FileOutputStream("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\javacore\\data\\giohang.PNG");
        byte[] listBytes = new byte[10];
        int listBytesLength = -1;
        while ((listBytesLength = fileInputStream.read(listBytes)) != -1) {
            fileOutputStream.write(listBytes, 0, listBytesLength);
        }
        fileOutputStream.close();
        fileOutputStream.close();
    }
}
