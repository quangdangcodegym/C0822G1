package com.codegym.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static List<String> readFile(String fileName) {
        ArrayList<String> listLines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            listLines = new ArrayList<>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLines.add(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return listLines;
    }

    public static void writeFile(List<String> listLines, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (String item : listLines) {
                fileWriter.write(item);
            }
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }



    }
}
