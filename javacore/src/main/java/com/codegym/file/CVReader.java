package com.codegym.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CVReader {

    private Reader reader;
    private Scanner scanner = new Scanner(System.in);

    public CVReader(Reader reader) {
        this.reader = reader;
    }
    public CVReader() {

    }
    public static void main(String[] args) throws FileNotFoundException {
//        FileReader fileReader = new FileReader("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\javacore\\data\\quocgia.csv");
//        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
//        CVReader cvReader = new CVReader(lineNumberReader);
//       cvReader.readAll();
        CVReader cvReader = new CVReader();
        cvReader.copyFile();
    }
    public List<String> readAll(){
        List<String> listLine = new ArrayList<>();
        try {
            // đọc thêm mẫu thiết kế decorator
            BufferedReader bufferedReader = new BufferedReader(reader);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                listLine.add(str);
            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return listLine;
    }

    public void copyFile() {
        System.out.println("Nhap file muon copy: ");
        String srcSource = scanner.nextLine();
        System.out.println("Nhap file dich den: ");
        String srcDes = scanner.nextLine();
        try {
            reader = new FileReader(srcSource);
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<String> listLines = readAll();

            FileWriter fileWriter = new FileWriter(srcDes);
            for (String str : listLines) {
                fileWriter.write(str + "\n");
            }

            fileWriter.close();
            reader.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public List<String> readAllType1() {
        List<String> listLine = new ArrayList<>();
        try {
            // đọc thêm mẫu thiết kế decorator
            FileReader fileReader = new FileReader("D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\javacore\\data\\quocgia.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                listLine.add(str);
            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return listLine;
    }
}
